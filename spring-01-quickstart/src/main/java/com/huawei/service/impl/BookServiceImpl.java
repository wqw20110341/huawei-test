package com.huawei.service.impl;

import com.huawei.dao.BookDao;
import com.huawei.dao.impl.BookDaoImpl;
import com.huawei.service.BookService;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 12:47 AM
 */
public class BookServiceImpl implements BookService {
    //5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ………………");
        bookDao.save();
    }
    // 6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
