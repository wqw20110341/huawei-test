package com.huawei;

import com.huawei.service.impl.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
