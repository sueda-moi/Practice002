package com.project.cn.mapper;

import com.project.cn.entity.Indent;
import com.project.cn.entity.IndentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndentMapper {
    long countByExample(IndentExample example);

    int deleteByExample(IndentExample example);

    int deleteByPrimaryKey(Integer indentsId);

    int insert(Indent record);

    int insertSelective(Indent record);

    List<Indent> selectByExample(IndentExample example);

    Indent selectByPrimaryKey(Integer indentsId);

    int updateByExampleSelective(@Param("record") Indent record, @Param("example") IndentExample example);

    int updateByExample(@Param("record") Indent record, @Param("example") IndentExample example);

    int updateByPrimaryKeySelective(Indent record);

    int updateByPrimaryKey(Indent record);


}