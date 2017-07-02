package com.lee.entity;

import java.util.List;

/**
 * Created by android on 2017/6/26.
 */
public class Data {


    private int code;
    private List<Book> bookList;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
