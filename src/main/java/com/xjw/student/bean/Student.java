package com.xjw.student.bean;


import lombok.*;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuid;//学生ID
    private String studentname;//学生姓名
    private String sex;//学生性别
    private String birthday;//学生生日
    private  Integer clsid;
    private Classes aclass;

    public Student() {
    }

    public Student(String studentname, String sex, String birthday, Integer clsid, Classes aclass) {

        this.studentname = studentname;
        this.sex = sex;
        this.birthday = birthday;
        this.clsid = clsid;
        this.aclass = aclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", studentname='" + studentname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", clsid=" + clsid +
                ", aclass=" + aclass +
                '}';
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getClsid() {
        return clsid;
    }

    public void setClsid(Integer clsid) {
        this.clsid = clsid;
    }

    public Classes getAclass() {
        return aclass;
    }

    public void setAclass(Classes aclass) {
        this.aclass = aclass;
    }

    public Student(Integer stuid, String studentname, String sex, String birthday, Integer clsid, Classes aclass) {
        this.stuid = stuid;
        this.studentname = studentname;
        this.sex = sex;
        this.birthday = birthday;
        this.clsid = clsid;
        this.aclass = aclass;

    }
}
