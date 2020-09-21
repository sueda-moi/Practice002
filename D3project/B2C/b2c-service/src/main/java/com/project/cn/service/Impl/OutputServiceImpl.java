package com.project.cn.service.Impl;

import com.project.cn.entity.Output;
import com.project.cn.mapper.OutputMapper;
import com.project.cn.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Controller
@Transactional
public class OutputServiceImpl implements OutputService {

    @Autowired
    private OutputMapper outputMapper;

    @Override
    public List<Output> findAll() {
        return outputMapper.selectByExample(null);
    }

    @Override
    public int deleteById(Integer id) {
        return outputMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addOutput(Output output) {
        return outputMapper.insert(output);
    }

    @Override
    public Output findById(Integer id) {
        return outputMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Output output) {
        return outputMapper.updateByPrimaryKey(output);
    }
}
