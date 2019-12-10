package com.pan.service.Impl;

import com.pan.mapper.OrdersMesMapper;
import com.pan.model.OrdersMes;
import com.pan.service.ShoworderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class ShoworderServiceImpl implements ShoworderService {

    @Autowired
    OrdersMesMapper ordersMesMapper;


    @Override
   public List<OrdersMes> findAllOrders(String idSeller) {
        // TODO Auto-generated method stub
        List<OrdersMes> list = null;
        list =(List<OrdersMes>) ordersMesMapper.selectByPrimaryKey(idSeller);
        return list;
    }


    @Override
    public int updatedeliver(String bookID) {
        ordersMesMapper.updateByPrimaryKey(bookID);
        return 1;
    }
}



