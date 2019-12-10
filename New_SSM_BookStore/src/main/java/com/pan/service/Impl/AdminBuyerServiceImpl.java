package com.pan.service.Impl;

import com.pan.mapper.BuyerMesMapper;
import com.pan.model.BuyerMes;
import com.pan.service.AdminBuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminBuyerServiceImpl implements AdminBuyerService {

    @Autowired
    BuyerMesMapper buyerMesMapper;

    @Override
    public List<BuyerMes> findAllBuyers() {
        List<BuyerMes> list = null;
        list = (List<BuyerMes>) buyerMesMapper.selectAllBuyers();
        return list;
    }

    @Override
    public List<BuyerMes> findBuyerByScore() {
        List<BuyerMes> list = null;
        list = (List<BuyerMes>) buyerMesMapper.selectBuyerByScore();
        return list;
    }
}
