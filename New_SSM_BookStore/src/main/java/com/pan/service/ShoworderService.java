package com.pan.service;


import com.pan.model.OrdersMes;

import java.util.List;

public interface ShoworderService {
    List<OrdersMes> findAllOrders(String idSeller);

    public int updatedeliver(String bookID);

}
