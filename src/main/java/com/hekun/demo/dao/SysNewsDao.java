package com.hekun.demo.dao;

import com.hekun.demo.entity.SysNews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Mapper
@Component
public interface SysNewsDao {
    @Select("select * from news")
    List<Map<String,Object>> findObjects();
    int updateObject(SysNews entity);
}
