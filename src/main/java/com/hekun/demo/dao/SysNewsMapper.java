package com.hekun.demo.dao;

import com.hekun.demo.entity.SysNews;

public interface SysNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    SysNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKeyWithBLOBs(SysNews record);

    int updateByPrimaryKey(SysNews record);
}