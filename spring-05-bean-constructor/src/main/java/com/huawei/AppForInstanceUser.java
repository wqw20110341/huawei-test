package com.huawei;

import com.huawei.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 2:56 AM
 */
public class AppForInstanceUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao2);
        System.out.println(userDao1);
        userDao1.save();
        ctx.registerShutdownHook();

    }
}
