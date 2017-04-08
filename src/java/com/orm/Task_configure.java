/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.orm;

/**
 *
 * @author vip
 */
public class Task_configure {
    private int task_type;
    private String task_name;

    public Task_configure() {
    }

    public Task_configure(int task_type, String task_name) {
        this.task_type = task_type;
        this.task_name = task_name;
    }

    public int getTask_type() {
        return task_type;
    }

    public void setTask_type(int task_type) {
        this.task_type = task_type;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }
}
