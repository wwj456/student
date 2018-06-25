package com.xjw.student.Service.Impl;

import com.xjw.student.Service.ClassesService;
import com.xjw.student.bean.Classes;
import com.xjw.student.repository.ClassesRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesRepostory classesRepostory;
    @Override
    public List<Classes> findAll() {
        return classesRepostory.findAll();
    }

    @Override
    public Classes findById(Integer id) {
        return classesRepostory.findById(id);
    }
}
