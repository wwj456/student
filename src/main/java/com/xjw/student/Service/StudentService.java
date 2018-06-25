package com.xjw.student.Service;

import com.xjw.student.bean.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询全部学生信息
     * @return
     * */
    List<Student> findAll();
    /**
     * 按ID查询学生信息
     * @param
     * @return
     * */
    Student findStudentById(Integer id);

    /**
     * 根据ID删除学生信息
     * @param
     * @return
     * */
    Integer deleteStudent(Integer stuid);
    /**
     * 修改学生信息
     * @param
     * @return
     * */
    Integer updateStudent(Student student);
    /**
     * 添加学生信息
     * @param
     * @return
     * */
    Integer saveStudent(Student student);

}
