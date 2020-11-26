package my.dubbo.provider.dao;

import my.dubbo.provider.entity.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author _lizy
 * @version 1.0
 * @description TODO
 * @date 2020/11/18 23:03
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct,Long> {

//    //默认的注释
//    //@Query("{\"bool\" : {\"must\" : {\"field\" : {\"content\" : \"?\"}}}}")
//    Page<EsProduct> findByContent(String content, Pageable pageable);
//
//    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"firstCode.keyword\" : \"?\"}}}}")
//    Page<EsProduct> findByFirstCode(String firstCode, Pageable pageable);
//
//    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"secordCode.keyword\" : \"?\"}}}}")
//    Page<EsProduct> findBySecordCode(String secordCode, Pageable pageable);
}
