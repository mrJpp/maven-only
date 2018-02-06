package com.mr.mapper;

import java.util.List;

import com.mr.entity.Student;
import com.mr.util.Page;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    //根据名称查询，返回信息
    Student selectByStuName(String stuName);
    
    //查询总条数
    Integer getStuCount();
    
    //查询和分页
    List<Student> queryStuList(Page pageUtil);
}