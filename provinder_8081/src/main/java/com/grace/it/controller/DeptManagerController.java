package com.grace.it.controller;

import com.grace.it.annotation.LoggerParam;
import com.grace.it.entity.DeptManager;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DeptManagerService;
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
@RequestMapping("/deptManager")
public class DeptManagerController {

    @Autowired
    private DeptManagerService deptManagerService;

    @GetMapping("/list")
    public List<DeptManager> selectByCondition(DeptManager deptManager){
        return deptManagerService.listByCondition(deptManager);
    }

    @GetMapping("/page")
    public PageResult<DeptManager> selectByPage(PageVo pageVo){
        return deptManagerService.selectByPage(pageVo);
    }

    @PostMapping("/update")
    public Integer updateByCondition(@RequestBody DeptManager deptManager){
        return deptManagerService.updateByCondition(deptManager);
    }

    @PostMapping("/add")
    public Integer insertDeptManager(@RequestBody DeptManager deptManager){
        return deptManagerService.insert(deptManager);
    }

    @DeleteMapping("/delete/{dempNo}")
    public Integer deleteByEmpNo(@PathVariable("dempNo") Long dempNo){
       return deptManagerService.deleteByEmpNo(dempNo);
    }
}
