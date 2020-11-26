###dubbo+sprintboot+es - helloworld项目
springboot2.3.0 + dubbo sprint boot2.7.7 + mybatis plus3.4.0 +zookeeper3.4.9

+es(ElasticSearch)

+logstash logback(elk)

>快速开始（QuickStart）
>* 启动zookeeper，测试zookeeper3.3.6 or zookeeper3.4.13正常
>    
>       如需测试es，再启动es（默认本地，远程修改dubbo-es-provider application.yml配置ip
        spring:
          elasticsearch:
            rest:
              uris: http://127.0.0.1:9200

>* 启动dubbo-es-provider
>* 启动dubbo-consumer
>* 访问dubbo-consumer，UserController接口eg：http://127.0.0.1:8080/sayhello/1
>* 访问dubbo-consumer，EsProductController接口eg：http://127.0.0.1:8080/product/create


####mybatis plus3.4.0
    mybatis、分页、generator代码生成


####ElasticSearch(es)7.6.2
>* 直接在需使用es的子项目中添加依赖包即可, 
   顶层项目spring-boot-starter-parent已添加spring-boot-starter-data-elasticsearch依赖

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
    </dependency>
    
>* springboot2.3.0默认依赖spring-boot-starter-data-elasticsearch2.3.0( spring-data-elasticsearch4.0.0 -- elasticsearch7.6.2)



####logstash logback
> 项目日志输出logstash(elk)
> 不需要直接删除以下内容

* 添加依赖(pom.xml)
            
            <!-- logstash logback -->
            <dependency>
                <groupId>net.logstash.logback</groupId>
                <artifactId>logstash-logback-encoder</artifactId>
                <version>${logstash-logback.version}</version>
            </dependency>
            
            
* 添加logback-spring.xml

    eg: dubbo-es\dubbo-consumer\src\main\resources\logback-spring.xml


