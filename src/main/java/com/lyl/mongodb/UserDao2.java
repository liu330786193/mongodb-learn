package com.lyl.mongodb;

import com.lyl.mongodb.entity.mongodb2.User2;
import org.springframework.stereotype.Component;

/**
 * @Author lyl
 * @Description
 * @Date 2018/9/28 下午2:04
 */
@Component
public class UserDao2 extends AbstractDao<User2> {

    public void save(User2 user){
        datastore.save(user);
    }

}
