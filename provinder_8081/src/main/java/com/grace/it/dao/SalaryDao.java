package com.grace.it.dao;

import com.grace.it.entity.Salary;
import com.grace.it.entity.Title;
import com.grace.it.model.PageVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/17
 * @author: Wenxin
 * @version: 1.0
 */
@Mapper
@Component
public interface SalaryDao {
    public List<Salary> listByCondition(Salary salary);

    public List<Salary> selectByPage(PageVo pageVo);

    public Integer countSalary();

    public Integer updateByCondition(Salary salary);

    public Integer insert(Salary salary);

    public Integer deleteByEmpNo(Long empNo);
}
