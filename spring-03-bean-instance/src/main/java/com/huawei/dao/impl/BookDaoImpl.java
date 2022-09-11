package com.huawei.dao.impl;

import com.huawei.dao.BookDao;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 12:42 AM
 */
public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;
//    private BookDaoImpl() {
//        System.out.println("book dao constructor is running ……………………");
//    }


    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ^^^^^"+databaseName + ","+connectionNum);
    }

    //表小bean初始化对应的操作
    public void init(){
        System.out.println("book init. ..");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("book  destory。。。。");
    }
}
