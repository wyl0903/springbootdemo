package com.oriental.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by WYL on 2017/8/14.
 */
public class Student implements Serializable {

    private int id;
    private String name;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
