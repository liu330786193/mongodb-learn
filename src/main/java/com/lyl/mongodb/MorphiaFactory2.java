package com.lyl.mongodb;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午1:49
 */
/*@Configuration
@ConditionalOnClass(Mongo.class)
public class MorphiaFactory2 {

    @Bean(name = "com.lyl.mongodb.entity.mongodb2")
    public Datastore get2(){
        MongoCredential credential = MongoCredential.createCredential("root", "test2", "123456".toCharArray());
        ServerAddress serverAddress = new ServerAddress("localhost", 27017);
        MongoClient mongoClient = new MongoClient(serverAddress, Arrays.asList(credential));

        Morphia morphia = new Morphia();
        morphia.mapPackage("com.lyl.mongodb.entity.mongodb2");
        return morphia.createDatastore(mongoClient, "test2");
    }

}*/
