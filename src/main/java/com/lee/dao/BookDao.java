package com.lee.dao;

import com.lee.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixinxin on 2017/6/24.
 */
public  interface BookDao {
    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * 查询所有图书
     *
     */
    List<Book> queryAll();

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId);
}
