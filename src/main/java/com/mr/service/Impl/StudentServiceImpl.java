package com.mr.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.entity.Student;
import com.mr.mapper.StudentMapper;
import com.mr.service.StudentService;
import com.mr.util.Page;


@Service("studentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentMapper studentMapper;
	

	@Override
	public Student selectByStuName(String stuName) {
		System.out.println("接口调用成功,传递的姓名为:"+stuName);
		Student student = studentMapper.selectByStuName(stuName);
		return student;
	}
	
	//查询和分页
	@Override
	public Page queryStuList(Page pageUtil) {
		//查询总条数
	Integer count = studentMapper.getStuCount();
	pageUtil.setCountItem(count);
	//查询集合
	List<Student> list=studentMapper.queryStuList(pageUtil);
	pageUtil.setList(list);
	return pageUtil;
	}

	//新增
	@Override
	public void addStu(Student student) {
		studentMapper.insert(student);
	}
	
	//删除
	@Override
	public void deleteStu(Student student) {
		studentMapper.deleteByPrimaryKey(student.getStuId());
	}
}
