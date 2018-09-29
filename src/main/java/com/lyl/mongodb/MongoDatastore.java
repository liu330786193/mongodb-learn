package com.lyl.mongodb;

import org.mongodb.morphia.Datastore;
import org.springframework.context.support.ApplicationObjectSupport;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/29 下午3:45
 */
//@Component
public class MongoDatastore extends ApplicationObjectSupport {

    private Map<String, Datastore> datastoreMap;

    @PostConstruct
    public void init(){
        this.datastoreMap = this.getApplicationContext().getBeansOfType(Datastore.class);
        Datastore datastore = datastoreMap.get("datastore");
        System.out.println();
    }

}
