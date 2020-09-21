package com.project.cn.service.Impl;

import com.project.cn.mapper.SettlementMapper;
import com.project.cn.service.SettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Controller
@Transactional
public class SettlementServiceImpl implements SettlementService {

    @Autowired
    private SettlementMapper settlementMapper;

    @Override
    public List<Settlement> findAll() {
        return settlementMapper.selectByExample(null);
    }

    @Override
    public int deleteById(Integer id) {
        return settlementMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addSettlement(Settlement settlement) {
        return settlementMapper.insert(settlement);
    }

    @Override
    public Settlement findById(Integer id) {
        return settlementMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Settlement settlement) {
        return settlementMapper.updateByPrimaryKey(settlement);
    }
}
