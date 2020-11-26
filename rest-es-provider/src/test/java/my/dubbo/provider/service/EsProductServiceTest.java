package my.dubbo.provider.service;

import my.dubbo.provider.BaseTest;
import my.dubbo.provider.entity.EsProduct;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;



public class EsProductServiceTest extends BaseTest {


    @Resource
    private IEsProductService esProductService;

    @Test
    public void createIndexTest(){
        Boolean createIndex = esProductService.createIndex();
        System.out.println(createIndex);
        Assert.assertTrue(createIndex);
    }


    @Test
    public void saveTest(){
        Boolean save = esProductService.save(getEsProduct());
        System.out.println(save);
        Assert.assertTrue(save);
    }


    @Test
    public void findByIdTest(){
        EsProduct esProduct = esProductService.findById(getEsProduct().getId());
        Assert.assertNotNull(esProduct);
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
