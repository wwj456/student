package com.xjw.student.Service.Impl;

import com.xjw.student.Service.StudentService;
import com.xjw.student.bean.Student;
import com.xjw.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public Integer deleteStudent(Integer stuid) {
        return studentRepository.deleteStudent(stuid);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public Integer saveStudent(Student student) {
        return studentRepository.saveStudent(student);
    }
}
