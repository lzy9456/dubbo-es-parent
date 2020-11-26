package my.dubbo.provider.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

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
public class EsProduct implements Serializable {

    @Id
    private Long id;

    // analyzer = "ik_max_word" 指定中文分词器ik_max_word
    @Field(type = FieldType.Text)
//    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;

    @Field
    private Integer age;

    @Field
    private Float money;

    @Field
    private boolean married;

}
