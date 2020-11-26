package org.dubbo.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import my.dubbo.provider.entity.User;
import my.dubbo.provider.es.EsProduct;
import my.dubbo.provider.es.IEsProductService;
import my.dubbo.provider.service.IUserDemoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.dubbo.consumer.entity.EsProdcutConvertMapper;
import org.dubbo.consumer.entity.vo.EsProductVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author _lizy
 * @version 1.0
 * @description es dubbo调用测试
 * @date 2020/10/17 21:26
 */
@RestController
public class EsProductController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference(version = "1.0.0")
    private IEsProductService esProductService;


    @ResponseBody
    @RequestMapping(value = "/product/create", method = GET)
    public String createProductIndex() {

        Boolean sucess = esProductService.createIndex();
        String jsonStr = JSON.toJSONString(sucess);

        logger.info(jsonStr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +" "+ jsonStr);
        return jsonStr;
    }



    @ResponseBody
    @RequestMapping(value = "/product/add", method = POST)
    public String addProduct(@RequestBody EsProductVO esProductVO) {
        if(esProductVO==null){return StringUtils.EMPTY;}

        Boolean saveBool = esProductService.save(EsProdcutConvertMapper.INSTANCE.vo2Bo(esProductVO));
        String jsonStr = JSON.toJSONString(saveBool);

        logger.info(jsonStr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() +" "+ jsonStr);
        return jsonStr;
    }


    @ResponseBody
    @RequestMapping(value = "/product/{id}", method = GET)
    public String product(@PathVariable("id") String id) {
        if(!NumberUtils.isDigits(id)){return StringUtils.EMPTY;}

        EsProduct esProduct = esProductService.findById(NumberUtils.toLong(id));
        String jsonStr = JSON.toJSONString(esProduct);

        logger.info(jsonStr);
        System.out.println(EsProduct.class.getSimpleName() +" "+ jsonStr);
        return jsonStr;
    }






    @ResponseBody
    @RequestMapping(value = "/es", method = GET)
    public String say() {
//        System.out.println(userService.getUser(1));
        return "ok";
    }

    








}
