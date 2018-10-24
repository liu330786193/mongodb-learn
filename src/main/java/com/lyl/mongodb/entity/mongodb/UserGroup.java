package com.lyl.mongodb.entity.mongodb;

import lombok.Data;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

/**
 * @Author lyl
 * @Description
 * @Date 2018/10/23 下午4:06
 */
@Data
public class UserGroup {

    @Id
    private String userName;
    private Double totalCount;
    private List<String> list;

}
