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
public class Attendance {
    private int staff_id;
    private Date check_time;

    public Attendance() {
    }

    public Attendance(int staff_id, Date check_time) {
        this.staff_id = staff_id;
        this.check_time = check_time;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public Date getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }
}
