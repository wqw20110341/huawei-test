package com.huawei.service.dao.impl;

import com.huawei.service.dao.BookDao;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 12:42 AM
 */
public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ^^^^^"+databaseName + ","+connectionNum);
    }
//    public void save() {
//        System.out.println("book dao save ^^^^^");
//    }

    //表小bean初始化对应的操作
    public void init(){
        System.out.println("book init. ..");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("book  destory。。。。");
    }
}
