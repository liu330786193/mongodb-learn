package com.lyl.mongodb;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午1:49
 */
@Configuration
@ConditionalOnClass(Mongo.class)
public class MorphiaFactory2 {

    @Bean(name = "com.lyl.mongodb.entity.mongodb2 , com.abc.dad.addd")
    public Datastore get2(){
        MongoCredential credential = MongoCredential.createCredential("root", "test2", "123456".toCharArray());
        ServerAddress serverAddress = new ServerAddress("localhost", 27017);
        MongoClient mongoClient = new MongoClient(serverAddress, Arrays.asList(credential));

        Morphia morphia = new Morphia();
        morphia.mapPackage("com.lyl.mongodb.entity.mongodb2");
        return morphia.createDatastore(mongoClient, "test2");
    }

}
