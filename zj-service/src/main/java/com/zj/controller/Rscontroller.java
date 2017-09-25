package com.zj.controller;

import com.zj.dao.bean.SbRepositoryImpl;
import com.zj.dao.local.SbRepository;
import com.zj.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flyhigh on 2017/6/11.
 */
@RestController
@RequestMapping("/Rs")
public class Rscontroller {

    @Autowired
    private SbRepositoryImpl sbRepository;

    @Autowired
    private SbRepository sbRepository2;

    @RequestMapping("/{id}")
    public Employee queryid(@PathVariable("id") String id) {
        Employee employee = new Employee();
        employee.setLastName("NBA");
        employee.setId(1);
//        System.out.println("鸡儿不放假 id:" + id);
     /*   Sbman sbman = new Sbman();
        sbman.setName("222");
        sbman.setAge(12);
        sbRepository2.save(sbman);*/
//        sbRepository.mergeSb(employee.getLastName());

        return employee;
    }


}
