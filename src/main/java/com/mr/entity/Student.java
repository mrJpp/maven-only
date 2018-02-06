package com.mr.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    private static final long serialVersionUID = -2092933903234109788L;
    private Integer stuId;

    private String stuName;

    private Integer stuSex;

    private Integer stuClass;

    private String stuHobby;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date stuTime;

    private String stuImg;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuHobby() {
        return stuHobby;
    }

    public void setStuHobby(String stuHobby) {
        this.stuHobby = stuHobby == null ? null : stuHobby.trim();
    }

    public Date getStuTime() {
        return stuTime;
    }

  //进行日期格式的转换
    public String  getStuTimeStr() {
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return stuTime==null?"":sdf.format(stuTime);
    }
    
    public void setStuTime(Date stuTime) {
        this.stuTime = stuTime;
    }

    public String getStuImg() {
        return stuImg;
    }

    public void setStuImg(String stuImg) {
        this.stuImg = stuImg == null ? null : stuImg.trim();
    }
}