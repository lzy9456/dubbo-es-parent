package org.dubbo.consumer.entity;

import my.dubbo.provider.dao.auto.UserMapper;
import my.dubbo.provider.es.EsProduct;
import org.dubbo.consumer.entity.vo.EsProductVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


/**
 * @Description
 *
 * @Author _lizy
 * @Date 2020/11/26 16:07
 */
@Mapper
public interface EsProdcutConvertMapper {
    EsProdcutConvertMapper INSTANCE = Mappers.getMapper(EsProdcutConvertMapper.class);


    /**
     * @Description
     *      复制转换vo to bo
     *      Mappings配置对应属性名
     * @param vo
     * @Return my.dubbo.provider.es.EsProduct
     * @Author _lizy
     * @Date 2020/11/26 19:13
     */
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "married", target = "married"),
            @Mapping(source = "money", target = "money"),
            @Mapping(source = "age", target = "age"),
            @Mapping(source = "name", target = "name")
    })
    EsProduct vo2Bo(EsProductVO vo);
}
