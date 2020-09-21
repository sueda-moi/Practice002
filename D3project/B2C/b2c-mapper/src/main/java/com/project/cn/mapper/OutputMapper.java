package com.project.cn.mapper;


import com.project.cn.entity.Output;
import com.project.cn.entity.OutputExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutputMapper {
    long countByExample(OutputExample example);

    int deleteByExample(OutputExample example);

    int deleteByPrimaryKey(Integer outputId);

    int insert(Output record);

    int insertSelective(Output record);

    List<Output> selectByExample(OutputExample example);

    Output selectByPrimaryKey(Integer outputId);

    int updateByExampleSelective(@Param("record") Output record, @Param("example") OutputExample example);

    int updateByExample(@Param("record") Output record, @Param("example") OutputExample example);

    int updateByPrimaryKeySelective(Output record);

    int updateByPrimaryKey(Output record);
}