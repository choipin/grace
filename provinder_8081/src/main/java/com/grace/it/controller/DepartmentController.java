package com.grace.it.controller;

import com.grace.it.annotation.LoggerParam;
import com.grace.it.entity.Department;
import com.grace.it.entity.Dept;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DepartmentService;
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
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/list")
    public List<Department> listByCondition( Department department){
        return departmentService.listByCondition(department);
    }

    @GetMapping("/page")
    public PageResult<Department> selectByPage( PageVo pageVo){
        return departmentService.selectTitleByPage(pageVo);
    }

    @PostMapping("/update")
    public long updateByCondition(@RequestBody Department department){
        return departmentService.updateByCondition(department);
    }

    @PostMapping("/add")
    public Integer addDepartment(@RequestBody Department department){
        return departmentService.insert(department);
    }
    @DeleteMapping("/delete/{deptNo}")
    public Integer deleteByCondition(@PathVariable("deptNo")String deptNo){
        return departmentService.delete(deptNo);
    }
}
