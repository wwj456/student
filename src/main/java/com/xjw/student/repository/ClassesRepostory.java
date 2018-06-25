package com.xjw.student.repository;

import com.xjw.student.bean.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassesRepostory {
    /**
     * 查询全部班级信息
     * */
    List<Classes> findAll();
    /**
     * 按ID查询班级信息
     * */
    Classes findById(@Param("clsid") Integer id);

}
