package com.pan.mapper;

import com.pan.model.ShoppingcartMes;

import java.util.List;

public interface ShoppingcartMesMapper {
    int deleteByPrimaryKey(String idBuyer);

    int insert(ShoppingcartMes record);

    int insertSelective(ShoppingcartMes record);

    List<ShoppingcartMes> selectByPrimaryKey(String idBuyer);

    int updateByPrimaryKeySelective(ShoppingcartMes record);

    int updateByPrimaryKey(ShoppingcartMes record);
}