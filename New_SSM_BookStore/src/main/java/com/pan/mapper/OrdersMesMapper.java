package com.pan.mapper;

import com.pan.model.OrdersMes;
import com.pan.model.User;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrdersMesMapper {
    public List<OrdersMes> selectByPrimaryKey();

    int updateByPrimaryKey(String bookID);

    int deleteByPrimaryKey(String idOrder);

    int insert(OrdersMes record);

    int insertSelective(OrdersMes record);

    List<OrdersMes> selectByPrimaryKey(String idSeller);

    List<OrdersMes> selectByPrimaryKeyL(String idBuyer);

    int updateByPrimaryKeySelective(OrdersMes record);

    int updateByPrimaryKey(OrdersMes record);
}