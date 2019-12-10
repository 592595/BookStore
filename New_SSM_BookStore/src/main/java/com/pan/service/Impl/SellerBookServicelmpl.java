/**
 * @author ：高铭
 * @date ：Created in 2019/11/21 22:03
 * @description：
 * @modified By：
 * @version: $
 */
package com.pan.service.Impl;

import com.pan.mapper.BooksMesMapper;
import com.pan.model.BooksMes;
import com.pan.service.SellerBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerBookServicelmpl implements SellerBookService {
    @Autowired
    BooksMesMapper booksMesMapper;

    @Override
    public List<BooksMes> findAllBook(String idSeller) {
        List<BooksMes> list = null;
        list = (List<BooksMes>) booksMesMapper.selectsellerbooks(idSeller);
        return list;
    }


    @Override
    public int addBook(BooksMes booksMes) {
        booksMes.setIdBook(String.valueOf(System.currentTimeMillis()));
        System.out.println(booksMes.toString());
        return booksMesMapper.insertSelective(booksMes);
    }
}
