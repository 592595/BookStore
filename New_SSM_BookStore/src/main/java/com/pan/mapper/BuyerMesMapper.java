package com.pan.mapper;

import com.pan.model.BuyerMes;

import java.util.List;

public interface BuyerMesMapper {
    int deleteByPrimaryKey(String idBuyer);

    int insert(BuyerMes record);

    int insertSelective(BuyerMes record);

    BuyerMes selectByPrimaryKey(String idBuyer);

    int updateByPrimaryKeySelective(BuyerMes record);

    int updateByPrimaryKey(BuyerMes record);

    List<BuyerMes> selectAllBuyers();

    List<BuyerMes> selectBuyerByScore();
}