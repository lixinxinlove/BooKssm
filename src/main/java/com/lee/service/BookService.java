package com.lee.service;

import com.lee.entity.Book;

import java.util.List;

/**
 * Created by lixinxin on 2017/6/24.
 */
public interface BookService {

    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    int addBook(long bookId, String name, int number);
}
