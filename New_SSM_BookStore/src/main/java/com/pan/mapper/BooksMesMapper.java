package com.pan.mapper;

import com.pan.model.BooksMes;
import com.pan.model.OrdersMes;

import java.util.List;

public interface BooksMesMapper {
    int deleteByPrimaryKey(String idBook);

    int insert(BooksMes record);

    int insertSelective(BooksMes record);

    BooksMes selectByPrimaryKey(String idBook);

    int updateByPrimaryKeySelective(BooksMes record);

    int updateByPrimaryKey(BooksMes record);

    List<BooksMes> selectAllBooks();

    List<BooksMes> selectViolationBooks();

    List<BooksMes> selectsellerbooks(String idSeller);

    int updateBooks(String bookID);

    int updateBookCancel(String bookID);
}