package com.project.cn.mapper;

import com.project.cn.domain.Settlement;
import com.project.cn.example.SettlementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SettlementMapper {
    long countByExample(SettlementExample example);

    int deleteByExample(SettlementExample example);

    int deleteByPrimaryKey(Integer settlementId);

    int insert(Settlement record);

    int insertSelective(Settlement record);

    List<Settlement> selectByExample(SettlementExample example);

    Settlement selectByPrimaryKey(Integer settlementId);

    int updateByExampleSelective(@Param("record") Settlement record, @Param("example") SettlementExample example);

    int updateByExample(@Param("record") Settlement record, @Param("example") SettlementExample example);

    int updateByPrimaryKeySelective(Settlement record);

    int updateByPrimaryKey(Settlement record);
}