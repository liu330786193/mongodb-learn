package com.lyl.mongodb;

import org.mongodb.morphia.Datastore;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.ParameterizedType;
import java.util.*;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/29 下午4:21
 */
public abstract class AbstractDao<T> implements ApplicationContextAware {

    protected Datastore datastore;


    private static ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        System.out.println(clazz.getPackage().getName());
        Map<String, Datastore> datastoreMap = context.getBeansOfType(Datastore.class);
        Set<Map.Entry<String, Datastore>> entries = datastoreMap.entrySet();
        for (Map.Entry<String, Datastore> entry : entries){
            String[] arr = entry.getKey().split(",");
            List<String> list = new ArrayList<>(5);
            Arrays.stream(arr).forEach(l -> {
                list.add(l.trim());
            });

            if (!list.contains(clazz.getPackage().getName())){
                continue;
            }
            this.datastore = entry.getValue();
            return;
        }
    }

}
