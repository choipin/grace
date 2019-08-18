package com.grace.it.dao;

import com.grace.it.entity.Dept;
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
public interface DeptDao {
    public List<Dept> listByCondition(Dept dept);

    public List<Dept> selectTitleByPage(PageVo pageVo);

    public Integer updateByCondition(Dept dept);

    public Integer insert(Dept dept);
}
