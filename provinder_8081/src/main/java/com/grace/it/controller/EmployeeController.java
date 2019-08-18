package com.grace.it.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@RestController
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

    @PostMapping("/update")
    public Integer updateByCondition(@RequestBody Employee employee){
        return employeeService.updateByCondition(employee);
    }

    @PostMapping("/add")
    public Integer addEmployee(@RequestBody Employee employee){
        return employeeService.insert(employee);
    }

    @DeleteMapping("/delete")
    public Integer deleteByEmpNo(@PathVariable("empNo")Long empNo){
        return employeeService.deleteByEmpNo(empNo);
    }
}
