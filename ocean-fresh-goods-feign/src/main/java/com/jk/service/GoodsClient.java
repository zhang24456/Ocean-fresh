package com.jk.service;

import com.jk.model.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ocean-fresh-goods")
public interface GoodsClient {
    @GetMapping("/findTypeList")
    List<Type> findTypeList();
}
