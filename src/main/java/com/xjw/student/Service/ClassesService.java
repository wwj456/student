package com.xjw.student.Service;

import com.xjw.student.bean.Classes;

import java.util.List;

public interface ClassesService {
    /**
     * 查询全部班级信息
     * */
    List<Classes> findAll();
    /**
     * 按ID查询班级信息
     * */
    Classes findById(Integer id);
}
