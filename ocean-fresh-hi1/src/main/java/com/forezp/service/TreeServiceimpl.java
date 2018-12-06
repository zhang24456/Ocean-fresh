package com.forezp.service;

import com.forezp.dao.TestDao;
import com.forezp.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceimpl implements  TreeService{

	@Autowired
	TestDao treeMapper;

	public List<Tree> queryTreeBypid() {
		String pid="0";
		return fingchid(pid);
	}


	private List<Tree> fingchid(String pid) {
		List<Tree> mentrlist=treeMapper.queryTreeBypid(pid);

		for (Tree menuTree : mentrlist) {
			String id = menuTree.getId();
			List<Tree> list=fingchid(id);
			if(list.size()>0){
				menuTree.setNodes(list);
			}

		}

		return mentrlist;
	}

}
