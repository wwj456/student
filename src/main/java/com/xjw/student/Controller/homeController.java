package com.xjw.student.Controller;


import com.xjw.student.Service.ClassesService;
import com.xjw.student.Service.StudentService;
import com.xjw.student.bean.Classes;
import com.xjw.student.bean.Student;
import com.xjw.student.repository.ClassesRepostory;
import com.xjw.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class homeController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassesService classesService;

    //查询
    @RequestMapping({"/"})
    public String list(Model model){
        List<Student> studentList=studentService.findAll();
        List<Classes> classesList = classesService.findAll();
        for (Classes classes:classesList ) {
            for (Student student:studentList) {
                if(student.getAclass().getClsid()==classes.getClsid()){
                    student.getAclass().setClassname(classes.getClassname());
                }
            }
        }
        model.addAttribute("list",studentList);
        return "list";
    }
    //添加
    @RequestMapping(value = "/toadd")
    public String toadd(Model model){
        List<Classes> classesList = classesService.findAll();
        model.addAttribute("clslist",classesList);
        return "save";
    }
    @RequestMapping("/student/save")
    public String toStudent(Student student, @RequestParam("clsid") Integer clsid){
        Classes classes = new Classes();
        classes.setClsid((clsid));
        student.setAclass(classes);
        studentService.saveStudent(student);
        return "redirect:/";
    }

    //修改
    @RequestMapping("/toedit/{stuid}")
    public String edit(Model model,@PathVariable Integer stuid){
        model.addAttribute("student", studentService.findStudentById(stuid));
        List<Classes> classesList = classesService.findAll();
        model.addAttribute("clslist",classesList);
        return "edit";
    }
    @RequestMapping(value = "/toedit/edit", method = RequestMethod.POST)
    public  String edit( Student student, Model model){
        int i = studentService.updateStudent(student);
        if(i>0){
            model.addAttribute("msg","修改成功!");
        }else {
            model.addAttribute("msg","修改失败！");
        }
        return "redirect:/";
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public  String delete(@RequestParam("stuid") Integer stuid){
        return studentService.deleteStudent(stuid) > 0?"删除成功":"删除失败";
    }
}
