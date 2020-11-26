package my.dubbo.provider.es.impl;

import com.google.common.collect.Iterables;
import my.dubbo.provider.es.EsProduct;
import my.dubbo.provider.es.EsProductRepository;
import my.dubbo.provider.es.IEsProductService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * @author _lizy
 * @version 1.0
 * @description TODO
 * @date 2020/11/18 23:10
 */
@DubboService(version = "1.0.0")
public class EsProductServiceImpl implements IEsProductService {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchTemplate;
    private Pageable pageable = PageRequest.of(0,10);


    @Autowired
    private EsProductRepository esProductRepository;



    @Override
    public Boolean createIndex() {
        return elasticsearchTemplate.createIndex(EsProduct.class);
    }

    @Override
    public Boolean deleteIndex(String index) {
        return elasticsearchTemplate.deleteIndex(index);
    }

    @Override
    public Boolean save(EsProduct docBean) {
        return esProductRepository.save(docBean)==null ? false : true;
    }

    @Override
    public Boolean saveAll(List<EsProduct> list) {
        return Iterables.isEmpty(esProductRepository.saveAll(list)) ? true : false;
    }

    @Override
    public EsProduct findById(Long id) {
        return esProductRepository.findById(id).orElse(null);
    }

    @Override
    public Iterator<EsProduct> findAll() {
        return esProductRepository.findAll().iterator();
    }

//    @Override
//    public Page<EsProduct> findByContent(String content) {
//        return esProductRepository.findByContent(content,pageable);
//    }
//
//    @Override
//    public Page<EsProduct> findByFirstCode(String firstCode) {
//        return esProductRepository.findByFirstCode(firstCode,pageable);
//    }
//
//    @Override
//    public Page<EsProduct> findBySecordCode(String secordCode) {
//        return esProductRepository.findBySecordCode(secordCode,pageable);
//    }
//
//    @Override
//    public Page<EsProduct> query(String key) {
//        return esProductRepository.findByContent(key,pageable);
//    }
}
