package com.project.cn.mapper;

import com.project.cn.entity.Ems;
import com.project.cn.entity.EmsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmsMapper {
    long countByExample(EmsExample example);

    int deleteByExample(EmsExample example);
    int deleteById(Integer id);

    int insert(Ems record);

    int insertSelective(Ems record);

    List<Ems> selectByExample(EmsExample example);
    Ems selectById(Integer id);


    int updateByExampleSelective(@Param("record") Ems record, @Param("example") EmsExample example);

    int updateByExample(@Param("record") Ems record, @Param("example") EmsExample example);

    int updateByPrimaryKey(Ems record);
}