package com.lyl.mongodb;

import com.lyl.mongodb.entity.mongodb.User;
import org.springframework.stereotype.Component;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午2:04
 */
@Component
public class UserDao extends AbstractDao<User> {


    public void save(User user){
        datastore.save(user);
    }

}
