package com.lyl.mongodb;

import com.lyl.mongodb.entity.mongodb.Sales;
import com.lyl.mongodb.entity.mongodb.User;
import com.lyl.mongodb.entity.mongodb.UserGroup;
import com.mongodb.AggregationOptions;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.aggregation.AggregationPipeline;
import org.mongodb.morphia.aggregation.Projection;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Iterator;

import static org.mongodb.morphia.aggregation.Group.*;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午2:04
 */
@Component
public class UserDao  {

    @Resource
    private Datastore datastore;

    public void save(User user){
        datastore.save(user);
    }

    public void group(){

        AggregationPipeline pipeline = this.datastore.createAggregation(Sales.class)
                .group(
                        id(grouping("item")),
                        grouping("totalCount",sum("price")),
                        grouping("list", Projection.expression("$push", "price"), Projection.expression("$push", "quantity"))
                );

        Iterator<UserGroup> iterator = pipeline.aggregate(UserGroup.class, AggregationOptions.builder().outputMode(AggregationOptions.OutputMode.CURSOR).build());
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()) {
            UserGroup ug = iterator.next();
            System.out.println(ug);
        }
    }

    public void group1(){

        Aggregation agg = new Aggregation(
            Aggregation.project()
        );
    }



}
