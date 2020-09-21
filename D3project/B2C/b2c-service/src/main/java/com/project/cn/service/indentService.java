package com.project.cn.service;



import com.project.cn.entity.Indent;

import java.util.List;

public interface indentService {

    public List<Indent> findAll();

    public int deleteById(Integer id);

    public int addIndent(Indent indent);

    public Indent findById(Integer id);

    public int update(Indent indent);

    public List<Indent> search(String text);

    List<Indent> selectBySouce();




}
