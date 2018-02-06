package com.mr.service;

import com.mr.entity.Student;
import com.mr.util.Page;

public interface StudentService {

	public  Student selectByStuName(String stuName);
	
		//查询分页
		Page queryStuList(Page pageUtil);
		
		//新增
		public void addStu(Student student);
		
		//删除
		public void deleteStu(Student student);
}
