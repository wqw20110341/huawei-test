package com.huawei;

import com.huawei.dao.BookDao;
import com.huawei.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @description:
 * @param: null
 * @return:
 * @author 125827
 * @date: 9/8/2022 12:59 AM
 */
public class App2 {
    public static void main( String[] args ) {
        //  3.获取IoC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
        BookDao bookDao =(BookDao) ctx.getBean("bookDao");
        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
