/**
 * @author ：高铭
 * @date ：Created in 2019/11/21 22:04
 * @description：
 * @modified By：
 * @version: $
 */
package com.pan.service;

import com.pan.model.BooksMes;

import java.util.List;

public interface SellerBookService {
    public List<BooksMes> findAllBook(String idSeller);


    int addBook(BooksMes booksMes);

}