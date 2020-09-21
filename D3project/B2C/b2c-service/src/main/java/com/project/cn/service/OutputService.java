package com.project.cn.service;





import com.project.cn.entity.Output;

import java.util.List;

public interface OutputService {

    public List<Output> findAll();

    public int deleteById(Integer id);

    public int addOutput(Output output);

    public Output findById(Integer id);

    public int update(Output output);






}
