package com.forezp.controller;

import com.forezp.model.Tree;
import com.forezp.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TreeController {

    @Autowired
    TreeService treeService;

    //用递归生成树
    @RequestMapping(value = "/queryTreeBypid")
    public List<Tree> queryTreeBypid(){
        List<Tree> trlist=treeService.queryTreeBypid();
        return trlist;
    }

}
