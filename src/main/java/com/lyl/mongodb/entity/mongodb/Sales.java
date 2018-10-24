package com.lyl.mongodb.entity.mongodb;

import lombok.Data;
import org.mongodb.morphia.annotations.*;

import java.util.Date;

/**
 * @Author lyl
 * @Description
 * @Date 2018/10/24 上午10:14
 */
@Data
@Entity("sales")
@Indexes(@Index(fields = {@Field("id")}))
public class Sales {

    @Id
    private Double id;
    private String item;
    private Double price;
    private Double quantity;
    private Date date;

}
