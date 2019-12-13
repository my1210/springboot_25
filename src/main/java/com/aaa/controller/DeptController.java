package com.aaa.controller;

import com.aaa.entity.Dept;
import com.aaa.service.DeptService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @ProjectName: springboot_13
 * @ClassName: DeptController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2019-11-27 18:06
 */
@Controller
@RequestMapping("dept")
public class DeptController {
    @Resource
    DeptService deptService;
    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("list",deptService.list());
        return "deptManager";
    }
    @RequestMapping("add")
    @ResponseBody
    public int add(Dept dept){
        return deptService.add(dept);
    }
    @RequestMapping("del")
    @ResponseBody
    public int del(Integer deptId){
        return deptService.del(deptId);
    }
    @RequestMapping("updateShow")
    @ResponseBody
    public Dept updateShow(Integer  deptId){
        return deptService.findById(deptId);
    }
    @RequestMapping("updateSubmit")
    @ResponseBody
    public int updateSubmit(Dept dept){
        return deptService.update(dept);
    }
}
