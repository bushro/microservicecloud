package com.smxy.lq.dao;

import com.smxy.lq.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2018-12-25
 */
@Mapper
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

