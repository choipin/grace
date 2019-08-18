package com.grace.it.service.impl;

import com.grace.it.dao.DeptManagerDao;
import com.grace.it.entity.DeptManager;
import com.grace.it.model.PageResult;
import com.grace.it.model.PageVo;
import com.grace.it.service.DeptManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @project: grace
 * @date: 2019/8/18
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class DeptManagerServiceImpl implements DeptManagerService {

    @Autowired
    private DeptManagerDao deptManagerDao;
    @Override
    public List<DeptManager> listByCondition(DeptManager deptManager) {
        return deptManagerDao.listByCondition(deptManager);
    }

    @Override
    public PageResult<DeptManager> selectByPage(PageVo pageVo) {
        List<DeptManager> rows = deptManagerDao.selectByPage(pageVo);
        Integer total = deptManagerDao.countDeptManager();
        return new PageResult<DeptManager>().setRows(rows).setTotal(total);
    }

    @Transactional
    @Override
    public Integer updateByCondition(DeptManager deptManager) {
        return deptManagerDao.updateByCondition(deptManager);
    }

    @Transactional
    @Override
    public Integer insert(DeptManager deptManager) {
        return deptManagerDao.insert(deptManager);
    }

    @Transactional
    @Override
    public Integer deleteByEmpNo(Long empNo) {
        return deptManagerDao.deleteByEmpNo(empNo);
    }
}
