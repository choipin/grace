package com.grace.it.controller;

import com.grace.it.annotation.LoggerParam;
import com.grace.it.entity.DeptEmp;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DeptEmpService;
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
@RequestMapping("/deptEmp")
public class DeptEmpController {

    @Autowired
    private DeptEmpService deptEmpService;

    @GetMapping("/list")
    public List<DeptEmp> listByCondition( DeptEmp deptEmp){
        return deptEmpService.listByCondition(deptEmp);
    }

    @GetMapping("/page")
    public PageResult<DeptEmp> pageDeptEmp( PageVo pageVo){
        return deptEmpService.selectTitleByPage(pageVo);
    }

    @PostMapping("/add")
    public Integer updateByCondition(@RequestBody DeptEmp deptEmp){
        final Integer insert = deptEmpService.insert(deptEmp);
        return deptEmpService.insert(deptEmp);
    }

    @DeleteMapping("/delete/{empNo}")
    public Integer deleteByEmpNo(@PathVariable("empNo")Long empNo){
        return deptEmpService.deleteByCondition(empNo);
    }
}
