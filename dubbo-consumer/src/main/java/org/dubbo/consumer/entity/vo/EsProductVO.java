package org.dubbo.consumer.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.dubbo.provider.es.EsProduct;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Data
public class EsProductVO implements Serializable {

    private Long id;
    private String name;
    private Integer age;
    private Float money;
    private Boolean married;


}