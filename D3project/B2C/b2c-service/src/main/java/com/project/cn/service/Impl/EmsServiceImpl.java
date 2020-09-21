package com.project.cn.service.Impl;

import com.project.cn.entity.Ems;

import com.project.cn.mapper.EmsMapper;
import com.project.cn.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmsServiceImpl implements EmsService {

    @Autowired
    EmsMapper emsMapper;

    @Override
    public List<Ems> findAll() {
        return  emsMapper.selectByExample(null);
    }

    @Override
    public int deleteById(Integer id) {

        return emsMapper.deleteById(id);
    }

    @Override
    public int addEms(Ems ems) {
        return emsMapper.insert(ems);
    }

    @Override
    public Ems findById(Integer id) {
        return emsMapper.selectById(id);
    }

    @Override
    public int update(Ems ems) {
        return emsMapper.updateByPrimaryKey(ems);
    }
}
