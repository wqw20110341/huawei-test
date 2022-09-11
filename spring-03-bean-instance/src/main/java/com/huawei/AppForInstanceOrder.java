package com.huawei;

import com.huawei.dao.OrderDao;
import com.huawei.factory.OrderDaoFactory;
import com.huawei.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 125827
 * @version 1.0
 * @description: TODO
 * @date 9/8/2022 2:41 AM
 */
public class AppForInstanceOrder {
    public static void main(String[] args) {
        //  3.获取IoC容器
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();
//        System.out.println("======");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();

    }
}
