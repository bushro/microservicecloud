package com.smxy.lq.controller;

import com.smxy.lq.entities.Dept;
import com.smxy.lq.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author BushRo
 * @Description: TOTO
 * @date 2019-01-02
 */
@RestController
public class DeptController_Consumer
{
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }
    @RequestMapping(value = "/consumer/dept/test")
    public Object test(Dept dept)
    {
        return this.service.test();
    }

}