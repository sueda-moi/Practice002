package com.project.cn.service;





import com.project.cn.entity.Ems;

import java.util.List;

public interface EmsService {

    public List<Ems> findAll();

    public int deleteById(Integer id);

    public int addEms(Ems ems);

    public Ems findById(Integer id);

    public int update(Ems ems);








}
