package com.lyl.mongodb.entity.mongodb;

import org.mongodb.morphia.annotations.*;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午1:54
 */
@Entity("user")
@Indexes(@Index(fields = {@Field("id")}))
public class User {

    @Id
    private Long id;
    @Property("name")
    private String name;
    private Integer age;
    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
