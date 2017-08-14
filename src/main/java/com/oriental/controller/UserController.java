package com.oriental.controller;

import com.oriental.model.Student;
import com.oriental.service.IStudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IStudentService studentService;

    /*
     *  http://localhost:8080/getUserInfo
     */

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public List<Student> getUserInfo() {
        List<Student> students = studentService.find();
        if(students!=null&&students.size()!=0){
            for (Student student : students) {
                System.out.println("user.getName():"+student.getName());
                logger.info("user.getId():"+student.getId());
            }
        }
        return students;
    }
}