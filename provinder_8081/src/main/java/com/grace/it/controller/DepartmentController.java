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
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department/list/")
    public List<Department> listByCondition(@RequestBody Department department){
        return departmentService.listByCondition(department);
    }

    @GetMapping("/department/page/")
    public PageResult<Department> selectByPage(@RequestBody PageVo pageVo){
        return departmentService.selectTitleByPage(pageVo);
    }

    @PostMapping("/department/update")
    public long updateByCondition(@RequestBody Department department){
        return departmentService.updateByCondition(department);
    }

    @DeleteMapping("/delete")
    public Integer deleteByCondition(@RequestBody Department department){
        return departmentService.delete(department);
    }
}
