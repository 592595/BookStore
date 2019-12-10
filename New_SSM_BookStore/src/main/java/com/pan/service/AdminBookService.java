package com.pan.service;


import com.pan.model.BooksMes;

import java.util.List;

public interface AdminBookService {
    public List<BooksMes> findAllBook();

    public List<BooksMes> findViolationBook();

    int updateBook(String bookID);

    int updateBookCancel(String bookID);

}