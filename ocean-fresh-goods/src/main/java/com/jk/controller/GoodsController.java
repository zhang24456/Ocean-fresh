package com.jk.controller;

import com.jk.model.Type;
import com.jk.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private IGoodsService iGoodsService;

    //获取类型集合
    @RequestMapping("/findTypeList")
    public List<Type> findTypeList(){
        return iGoodsService.findTypeList();
    }


}
