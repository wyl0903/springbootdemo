package com.oriental.service.impl;

import com.oriental.dao.IStudentDao;
import com.oriental.model.Student;
import com.oriental.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by WYL on 2017/8/14.
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public List<Student> find() {
        return studentDao.find();
    }
}
