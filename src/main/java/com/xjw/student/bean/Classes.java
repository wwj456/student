package com.xjw.student.bean;

import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode
public class Classes implements Serializable {
    @Override
    public String toString() {
        return "Classes{" +
                "clsid=" + clsid +
                ", classname='" + classname + '\'' +
                '}';
    }

    public Integer getClsid() {
        return clsid;
    }

    public void setClsid(Integer clsid) {
        this.clsid = clsid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Classes() {

    }

    public Classes(Integer clsid, String classname) {

        this.clsid = clsid;
        this.classname = classname;
    }

    private Integer clsid;//班级ID
    private String classname;//班级名称
}
