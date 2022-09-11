package com.huawei.dao.impl;

import com.huawei.dao.BookDao;

import java.util.*;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 12:42 AM
 */
public class BookDaoImpl implements BookDao {
    private int[] array ;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
//    public void save() {
//        System.out.println("book dao save ^^^^^"+databaseName + ","+connectionNum);
//    }
    public void save() {
        System.out.println("book dao save ^^^^^");
        System.out.println(Arrays.toString(array));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(properties);
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
