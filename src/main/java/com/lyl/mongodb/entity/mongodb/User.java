package com.lyl.mongodb.entity.mongodb;

import lombok.Data;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.util.Date;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午1:54
 */
@Data
@Entity("user")
@Indexes(@Index(fields = {@Field("id")}))
public class User {

    @Id
    private ObjectId id;
    private String userName;
    private String password;
    private int grade;
    private int classId;
    private Date createTime;

}
