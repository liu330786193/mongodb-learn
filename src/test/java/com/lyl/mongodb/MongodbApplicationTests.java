package com.lyl.mongodb;

import com.lyl.mongodb.entity.mongodb.User;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbApplicationTests {

    @Autowired
    private UserDao userDao;


    @Test
    public void contextLoads() {
    }

    @Test
    public void testMorphia(){
        User user = new User();
        user.setId(new ObjectId(new Date()));
        user.setPassword("123");
        user.setClassId(1);
        user.setCreateTime(new Date());
        user.setGrade(5);
        userDao.save(user);
        System.out.println("。。。。。");
    }
    /*@Test
    public void testMorphia2(){
        User2 user = new User2();
        user.setId(System.currentTimeMillis());
        user.setName("123");
        user.setAge(11);
        user.setNickname("小白");
        userDao2.save(user);
        System.out.println("。。。。。");
    }*/

    @Test
    public void testMorphiaGroup1(){
        userDao.group();
    }

}
