package org.dubbo.consumer.controller;

import com.alibaba.fastjson.JSON;
import my.dubbo.provider.entity.User;
import my.dubbo.provider.es.IEsProductService;
import my.dubbo.provider.service.IUserDemoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author _lizy
 * @version 1.0
 * @description dubbo service调用测试
 * @date 2020/10/17 21:26
 */
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference(version = "1.0.0")
    private IUserDemoService userService;

    @ResponseBody
    @RequestMapping(value = "/sayhello/{id}", method = GET)
    public String sayHello(@PathVariable("id") String id) {
        if(!NumberUtils.isDigits(id)){return StringUtils.EMPTY;}

        User user = userService.getUser(Integer.valueOf(id));
        String userStr = JSON.toJSONString(user);

        logger.info(userStr);
        System.out.println("helloworld! user:" + userStr);
        return userStr;
    }

    @ResponseBody
    @RequestMapping(value = "/say", method = GET)
    public String say() {
//        System.out.println(userService.getUser(1));
        return "helloworld ok";
    }










}
