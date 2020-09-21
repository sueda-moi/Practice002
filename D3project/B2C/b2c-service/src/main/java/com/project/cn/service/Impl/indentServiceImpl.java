package com.project.cn.service.Impl;




import com.project.cn.entity.Indent;
import com.project.cn.entity.IndentExample;
import com.project.cn.mapper.IndentMapper;
import com.project.cn.service.indentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class indentServiceImpl implements indentService {

    @Autowired
    private IndentMapper indentMapper;

    @Override
    public List<Indent> findAll() {
        return indentMapper.selectByExample(null);
    }

    @Override
    public int deleteById(Integer id) {
        return indentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addIndent(Indent indent) {
        return indentMapper.insert(indent);
    }

    @Override
    public Indent findById(Integer id) {
        return indentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Indent indent) {
        return indentMapper.updateByPrimaryKey(indent);
    }

    @Override
    public List<Indent> search(String text) {
        Indent indent=new Indent();
        IndentExample example=new IndentExample();
        IndentExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isNotBlank(indent.getGoodsName())){
            criteria.andGoodsNameLike('%'+text+'%');
        }
        if (!StringUtils.isNoneBlank(indent.getIndentsStatus())){
            criteria.andIndentsStatusLike('%'+text+'%');
        }
        if (!StringUtils.isNoneBlank(indent.getIndentsSource())){
            criteria.andIndentsSourceLike('%'+text+'%');
        }
        if (!StringUtils.isNoneBlank(indent.getIndentsClientname())){
            criteria.andIndentsClientnameLike('%'+text+'%');
        }
        if (!StringUtils.isNoneBlank(indent.getIndentsClientadress())){
            criteria.andIndentsClientadressLike('%'+text+'%');
        }

        return indentMapper.selectByExample(example);

    }

    @Override
    public List<Indent> selectBySouce() {
        IndentExample example=new IndentExample();
        IndentExample.Criteria criteria = example.createCriteria();
        criteria.andIndentsSourceEqualTo("当当");
        List<Indent> indents = indentMapper.selectByExample(example);
        return indents;
    }
}

