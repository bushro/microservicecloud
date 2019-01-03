package com.smxy.lq.service;

import com.smxy.lq.entities.Dept;

import java.util.List;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2018-12-25
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
