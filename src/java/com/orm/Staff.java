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
public class Staff {
    private int staff_id;
    private int gender;
    private String staff_name;
    private int staff_tel;
    private int role;
    private Date birth;
    private Date create_time;
    private int org_id;

    public Staff() {
    }

    public Staff(int staff_id, int gender, String staff_name, int staff_tel, int role, Date birth, Date create_time, int org_id) {
        this.staff_id = staff_id;
        this.gender = gender;
        this.staff_name = staff_name;
        this.staff_tel = staff_tel;
        this.role = role;
        this.birth = birth;
        this.create_time = create_time;
        this.org_id = org_id;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getStaff_tel() {
        return staff_tel;
    }

    public void setStaff_tel(int staff_tel) {
        this.staff_tel = staff_tel;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
