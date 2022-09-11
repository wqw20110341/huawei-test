package com.huawei.factory;

import com.huawei.dao.UserDao;
import com.huawei.dao.impl.UserDaoImpl;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 2:55 AM
 */
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
