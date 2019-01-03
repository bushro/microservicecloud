package com.smxy.lq.service.impl;

import com.smxy.lq.dao.DeptDao;
import com.smxy.lq.entities.Dept;
import com.smxy.lq.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2018-12-25
 */
@Service
public class DeptServiceImpl implements DeptService
{
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}