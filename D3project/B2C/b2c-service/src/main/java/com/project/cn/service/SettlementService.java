package com.project.cn.service;

import java.util.List;

public interface SettlementService {

    public List<Settlement> findAll();

    public int deleteById(Integer id);

    public int addSettlement(Settlement settlement);

    public Settlement findById(Integer id);

    public int update(Settlement settlement);








}
