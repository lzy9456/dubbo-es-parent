package my.dubbo.provider;

import com.alibaba.fastjson.JSON;
import my.dubbo.provider.entity.EsProduct;
import my.dubbo.provider.service.IEsProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.IndexOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * JUnit test for mybatisplus.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={RestEsProviderApp.class})// 指定启动类
public class EsTest {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Resource
    private IEsProductService esProductService;

    @Test
    public void existsTest(){
        IndexOperations ops = elasticsearchOperations.indexOps(EsProduct.class);
        boolean exists = ops.exists();
        System.out.println(exists);
        Assert.assertTrue(exists);
    }


    @Test
    public void saveTest(){
        EsProduct save = elasticsearchOperations.save(getEsProduct());
        System.out.println(JSON.toJSONString(save));
        Assert.assertNotNull(save);
    }


    @Test
    public void findByIdTest(){
//        EsProduct person = elasticsearchOperations.find();
//        System.out.println(JSON.toJSONString(person));
//        Assert.assertNotNull(person);
    }

























    private EsProduct getEsProduct() {
        EsProduct esProduct = new EsProduct();
        esProduct.setId(1003L);
        esProduct.setAge(3);
        esProduct.setName("lizy001");
        esProduct.setMoney(23.5f);
        esProduct.setMarried(false);
        return esProduct;
    }

    
}
