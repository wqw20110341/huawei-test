package com.huawei.factory;

import com.huawei.dao.OrderDao;
import com.huawei.dao.impl.OrderDaoImpl;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 2:39 AM
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup &………………");
        return new OrderDaoImpl();
    }
}
