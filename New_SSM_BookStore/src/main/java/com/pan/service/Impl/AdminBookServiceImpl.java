package com.pan.service.Impl;

import com.pan.mapper.BooksMesMapper;
import com.pan.model.BooksMes;
import com.pan.service.AdminBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminBookServiceImpl implements AdminBookService {

    @Autowired
    BooksMesMapper booksMesMapper;

    @Override
    public List<BooksMes> findAllBook() {
        List<BooksMes> list = null;
        list = (List<BooksMes>) booksMesMapper.selectAllBooks();
        return list;
    }

    @Override
    public int updateBook(String bookID) {
        booksMesMapper.updateBooks(bookID);
        return 1;
    }

    @Override
    public List<BooksMes> findViolationBook() {
        List<BooksMes> list = null;
        list = (List<BooksMes>) booksMesMapper.selectViolationBooks();
        return list;
    }

    @Override
    public int updateBookCancel(String bookID) {
        booksMesMapper.updateBookCancel(bookID);
        return 1;
    }

}
