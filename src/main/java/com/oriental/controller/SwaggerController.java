package com.oriental.controller;

import com.oriental.model.Student;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class SwaggerController {

    /*
     *  http://localhost:8080/swagger/index.html
     */

    @ApiOperation(value = "Get all users", notes = "requires noting")
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getUsers() {
        List<Student> list = new ArrayList<Student>();

        Student user = new Student();
        user.setName("hello");
        list.add(user);

        Student user2 = new Student();
        user.setName("world");
        list.add(user2);
        return list;
    }

    @ApiOperation(value = "Get user with id", notes = "requires the id of user")
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Student getUserById(@PathVariable String name) {
        Student user = new Student();
        user.setName("hello world");
        return user;
    }
}