package com.lyl.mongodb;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午1:49
 */
@Configuration
@ConditionalOnClass(Mongo.class)
public class MorphiaFactory1 {

    @Resource
    private Mongo mongo;
    @Resource
    private MongoProperties mongoProperties;

    @Bean(name = "com.lyl.mongodb.entity.mongodb")
    public Datastore get(){
        Morphia morphia = new Morphia();
        morphia.mapPackage("com.lyl.mongodb.entity.mongodb");
        return morphia.createDatastore((MongoClient) mongo, mongoProperties.getDatabase());
    }


}
