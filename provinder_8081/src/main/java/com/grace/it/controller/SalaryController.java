package com.grace.it.controller;

import com.grace.it.annotation.LoggerParam;
import com.grace.it.entity.Salary;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.SalaryService;
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
@RequestMapping("/salary")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/list")
    public List<Salary> selectSalaryByCondition(Salary salary){
        return salaryService.listByCondition(salary);
    }

    @GetMapping("/page")
    public PageResult<Salary> selectSalaryByPage(PageVo pageVo){
        return salaryService.selectTitleByPage(pageVo);
    }

    @PostMapping("/update")
    public Integer updateSalaryByCondition(@RequestBody Salary salary){
        return salaryService.updateByCondition(salary);
    }

    @PostMapping("/add")
    public Integer addSalary(@RequestBody Salary salary){
        return salaryService.insert(salary);
    }

    @DeleteMapping("/delete/{empNo}")
    public Integer deleteByEmpNo(@PathVariable("empNo") Long empNo){
        return salaryService.deleteByEmpNo(empNo);
    }
}
