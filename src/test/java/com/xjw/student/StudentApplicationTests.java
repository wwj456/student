package com.xjw.student;

import com.xjw.student.repository.ClassesRepostory;
import com.xjw.student.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTests {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ClassesRepostory classesRepostory;

    @Test
    public void contextLoads() {
        System.out.print(studentRepository.findAll());
        System.out.print(classesRepostory.findAll());
    }

}
