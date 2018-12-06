package com.jk.dao;

import com.jk.model.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsMapper {

    @Select("select ty.type_id,ty.type_name from t_type ty")
    List<Type> findTypeList();
}
