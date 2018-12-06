package com.jk.service;

import com.jk.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements  IGoodsService {

    @Autowired
    private GoodsClient goodsClient;

    @Override
    public List<Type> findTypeList() {
        return goodsClient.findTypeList();
    }
}
