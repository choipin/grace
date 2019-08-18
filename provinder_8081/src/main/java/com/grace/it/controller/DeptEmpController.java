package com.grace.it.controller;

import com.grace.it.annotation.LoggerParam;
import com.grace.it.entity.DeptEmp;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DeptEmpService;
import com.sun.org.apache.regexp.internal.RE;
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
public class DeptEmpController {

    @Autowired
    private DeptEmpService deptEmpService;

    @GetMapping("/deptEmp/list")
    public List<DeptEmp> listByCondition(@RequestBody DeptEmp deptEmp){
        return deptEmpService.listByCondition(deptEmp);
    }

    @GetMapping("/deptEmp/page")
    public PageResult<DeptEmp> pageDeptEmp(@RequestBody PageVo pageVo){
        return deptEmpService.selectTitleByPage(pageVo);
    }

    @PostMapping("/deptEmp/add")
    public Integer updateByCondition(@RequestBody DeptEmp deptEmp){
        return deptEmpService.insert(deptEmp);
    }

    @DeleteMapping("/delete/{empNo}")
    public Integer deleteByEmpNo(@PathVariable("empNo")Long empNo){
        return deptEmpService.deleteByCondition(empNo);
    }
}
