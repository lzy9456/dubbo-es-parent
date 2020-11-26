package my.dubbo.provider.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author _lizy
 * @version 1.0
 * @description TODO
 * @date 2020/11/18 22:56
 */
@Document(indexName = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EsProduct {

    @Id
    private Long id;

    // analyzer 指定中文分词器ik_max_word
//    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    @Field(type = FieldType.Text)
    private String name;

    @Field
    private Integer age;

    @Field
    private Float money;

    @Field
    private boolean isMarried;

}
