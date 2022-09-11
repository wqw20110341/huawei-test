package com.huawei.dao.impl;

import com.huawei.dao.UserDao;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 2:54 AM
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("=======user dao created========");
    }

    //表小bean初始化对应的操作
    public void init(){
        System.out.println("user init. ..");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("user destory。。。。");
    }
}
