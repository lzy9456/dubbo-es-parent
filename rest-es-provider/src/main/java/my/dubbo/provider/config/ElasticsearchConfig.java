//package my.dubbo.provider.config;
//
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.convert.support.DefaultConversionService;
//import org.springframework.data.elasticsearch.client.ClientConfiguration;
//import org.springframework.data.elasticsearch.client.RestClients;
//import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
//import org.springframework.data.elasticsearch.core.convert.ElasticsearchConverter;
//import org.springframework.data.elasticsearch.core.mapping.SimpleElasticsearchMappingContext;
//
///**
// * @author _lizy
// * @version 1.0
// * @description 此配置失败，未找到匹配的bean配置
// * @date 2020/11/18 22:12
// */
//@Configuration
//public class ElasticsearchConfig extends AbstractElasticsearchConfiguration {
////    public static final RequestOptions COMMON_OPTIONS;
////    static {
////        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
////        COMMON_OPTIONS = builder.build();
////    }
//
//
//
//    /**
//     *
//     */
//    @Bean
//    @Override
//    public RestHighLevelClient elasticsearchClient() {
//        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .build();
//
//        return RestClients.create(clientConfiguration).rest();
//    }
//
//
//
//}
