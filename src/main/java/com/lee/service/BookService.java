package com.lee.service;

import com.lee.entity.Book;
import com.lee.entity.LeePage;

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
    Book getById(int bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    /**
     * 分页查
     */
    List<Book> queryPage(LeePage leePage);

    int addBook(Book book);

    int deleteById(int bookId);
}
