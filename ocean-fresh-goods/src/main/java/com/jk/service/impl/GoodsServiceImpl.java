package com.jk.service.impl;

import com.jk.dao.GoodsMapper;
import com.jk.model.Type;
import com.jk.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public List<Type> findTypeList() {
        return goodsMapper.findTypeList();
    }
}
