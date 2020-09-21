package com.project.cn.mapper;

import com.project.cn.domain.Output;
import com.project.cn.example.OutputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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