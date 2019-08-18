package com.grace.it.controller;

import com.grace.it.annotation.LoggerParam;
import com.grace.it.entity.Title;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.TitleService;
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
public class TitleController {

    @Autowired
    private TitleService titleService;

    @GetMapping("/title")
    public List<Title> selectTitleByCondition(Title title){
        return titleService.listByCondition(title);
    }

    @GetMapping("/page")
    public PageResult<Title> selectByPage(PageVo pageVo){
        return titleService.selectTitleByPage(pageVo);
    }

    @PostMapping("/update")
    public Integer updateByCondition(@RequestBody Title title){
        return titleService.updateByCondition(title);
    }

    @PostMapping("/add")
    public Integer addTitle(@RequestBody Title title){
        return titleService.add(title);
    }

    @DeleteMapping("/delete/{empNo}")
    public Integer deleteByEmpNo(@PathVariable("empNo")Long empNo){
        return titleService.deleteByEmpNo(empNo);
    }
}
