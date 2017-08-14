package com.oriental.mapper;

import com.oriental.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select ID,NAME,create_time createTime from student;")
    public List<Student> find();
}