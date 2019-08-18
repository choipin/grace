package com.grace.it.controller;

import com.grace.it.annotation.LoggerParam;
import com.grace.it.entity.Employee;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DeptEmpService;
import com.grace.it.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@RestController
@LoggerParam
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> selectByCondition(Employee employee){
        return employeeService.listByCondition(employee);
    }

    @GetMapping("/page")
    public PageResult<Employee> selectByPage(PageVo pageVo){
        return employeeService.selectByPage(pageVo);
    }

    @PostMapping("/add")
    public Integer updateByCondition(@RequestBody Employee employee){
        return employeeService.updateByCondition(employee);
    }

    @DeleteMapping("/delete")
    public Integer deleteByEmpNo(@PathVariable("empNo")Long empNo){
        return employeeService.deleteByEmpNo(empNo);
    }
}
