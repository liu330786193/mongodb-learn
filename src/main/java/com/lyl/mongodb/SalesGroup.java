package com.lyl.mongodb;

import lombok.Data;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @Author lyl
 * @Description
 * @Date 2018/10/24 上午11:31
 */
@Data
@Entity
public class SalesGroup {

    @Id
    private String item;
    private Double totalCount;
    private Double list;

}
