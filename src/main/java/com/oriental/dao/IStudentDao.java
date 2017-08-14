package com.oriental.dao;

import com.oriental.model.Student;

import java.util.List;
import java.util.Map;

public interface IStudentDao {
    List<Student> find();
}