package com.lee.dao;

import com.lee.entity.Book;
import com.lee.entity.LeePage;

import java.util.List;

/**
 * Created by lixinxin on 2017/6/24.
 */
public interface BookDao {
    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * 查询所有图书
     */
    List<Book> queryAll();


    /**
     * 分页查
     */
    List<Book> queryPage(LeePage leePage);


    int addBook(Book book);

    int deleteById(int id);

}
