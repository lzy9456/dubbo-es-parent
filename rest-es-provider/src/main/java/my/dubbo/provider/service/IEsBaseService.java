package my.dubbo.provider.service;

import org.springframework.data.domain.Page;

import java.util.Iterator;
import java.util.List;

/**
 * @author _lizy
 * @version 1.0
 * @description
 * @date 2020/11/18 23:03
 */
public interface IEsBaseService<T> {
    Boolean createIndex();

    Boolean deleteIndex(String index);

    Boolean save(T docBean);

    Boolean saveAll(List<T> list);

    default T findById(Long id){return null;}

    Iterator<T> findAll();

//    Page<T> findByContent(String content);
//
//    Page<T> findByFirstCode(String firstCode);
//
//    Page<T> findBySecordCode(String secordCode);
//
//    Page<T> query(String key);
}
