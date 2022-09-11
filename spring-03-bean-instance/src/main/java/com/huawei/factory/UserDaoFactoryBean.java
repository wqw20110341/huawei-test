package com.huawei.factory;

import com.huawei.dao.UserDao;
import com.huawei.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 2:59 AM
 */
public class UserDaoFactoryBean  implements FactoryBean<UserDao> {
    //代替原始实例工J厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
