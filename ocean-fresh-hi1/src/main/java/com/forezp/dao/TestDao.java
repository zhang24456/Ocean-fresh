package com.forezp.dao;

import com.forezp.model.Tree;
import com.forezp.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TestDao {
	@Select(" select * from y_test")
	List<User> sele();
        //第一条 查询是规范
	void delete(@Param("id") String id);

	void add(@Param("user") User user);

	void update(@Param("id") String id, @Param("name") String name, @Param("monreg") String monreg);

	User toindexupdate(@Param("id") String id);

	@Select("  select * from t_tree where pid=${pid} ")
	List<Tree> queryTreeBypid(@Param("pid") String pid);

}

