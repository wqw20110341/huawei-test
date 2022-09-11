package com.huawei.service.impl;

import com.huawei.dao.BookDao;
import com.huawei.dao.UserDao;
import com.huawei.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 12:47 AM
 */
public class BookServiceImpl implements BookService , InitializingBean, DisposableBean {
    //5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("book service save ………………");
        bookDao.save();
        userDao.save();
    }
    // 6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service  destory。。。。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service  init. ..");
    }
}
