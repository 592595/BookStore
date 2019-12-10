package com.pan.service;


import com.pan.model.BuyerMes;

import java.util.List;

public interface AdminBuyerService {
    public List<BuyerMes> findAllBuyers();

    public List<BuyerMes> findBuyerByScore();
}