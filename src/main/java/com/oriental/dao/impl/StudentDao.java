package com.oriental.dao.impl;

import com.oriental.dao.IStudentDao;
import com.oriental.mapper.StudentMapper;
import com.oriental.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by WYL on 2017/8/14.
 */
@Repository
public class StudentDao implements IStudentDao{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> find() {
        return studentMapper.find();
    }
}
