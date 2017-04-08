/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.orm;

import java.util.Date;

/**
 *
 * @author vip
 */
public class Task {
    private int task_id;
    private Date start_time;
    private Date end_time;
    private Date limit_time;
    private int del_id;
    private int state;
    private String content;
    private int task_type;

    public Task() {
    }

    public Task(int task_id, Date start_time, Date end_time, Date limit_time, int del_id, int state, String content, int task_type) {
        this.task_id = task_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.limit_time = limit_time;
        this.del_id = del_id;
        this.state = state;
        this.content = content;
        this.task_type = task_type;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Date getLimit_time() {
        return limit_time;
    }

    public void setLimit_time(Date limit_time) {
        this.limit_time = limit_time;
    }

    public int getDel_id() {
        return del_id;
    }

    public void setDel_id(int del_id) {
        this.del_id = del_id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTask_type() {
        return task_type;
    }

    public void setTask_type(int task_type) {
        this.task_type = task_type;
    }
}
