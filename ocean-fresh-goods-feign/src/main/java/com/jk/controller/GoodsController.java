package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.Type;
import com.jk.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private IGoodsService iGoodsService;

    @RequestMapping("/findTypeList")
    public String findTypeList(@RequestParam(value = "callback")String callback){
        List<Type> list = iGoodsService.findTypeList();
        String aa = JSON.toJSONString(list);
        return callback+"("+aa+")";
    }



}
