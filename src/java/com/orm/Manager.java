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
public class Manager {
    private int staff_id;
    private int org_id;
    private int state;

    public Manager() {
    }

    public Manager(int staff_id, int org_id, int state) {
        this.staff_id = staff_id;
        this.org_id = org_id;
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }
}
