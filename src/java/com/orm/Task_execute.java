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
public class Task_execute {
    private int task_id;
    private int re_turn;
    private int staff_id;
    private int task_type;
    private String content;
    private Date start_time;
    private Date end_time;
    private Date limit_time;

    public Task_execute() {
    }

    public Task_execute(int task_id, int re_turn, int staff_id, int task_type, String content, Date start_time, Date end_time, Date limit_time) {
        this.task_id = task_id;
        this.re_turn = re_turn;
        this.staff_id = staff_id;
        this.task_type = task_type;
        this.content = content;
        this.start_time = start_time;
        this.end_time = end_time;
        this.limit_time = limit_time;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getRe_turn() {
        return re_turn;
    }

    public void setRe_turn(int re_turn) {
        this.re_turn = re_turn;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getTask_type() {
        return task_type;
    }

    public void setTask_type(int task_type) {
        this.task_type = task_type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    
}
