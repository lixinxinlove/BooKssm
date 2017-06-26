package com.lee.service.impl;

import com.lee.dao.BookDao;
import com.lee.entity.Book;
import com.lee.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixinxin on 2017/6/24.
 */
@Service
public class BookServiceImpl implements BookService {
    // 注入Service依赖
    @Autowired
    private BookDao bookDao;

    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    public List<Book> getList() {
        return bookDao.queryAll();
    }

    public int addBook(long bookId, String name, int number) {

        bookDao.addBook(bookId,name,number);

        return 0;
    }
}
