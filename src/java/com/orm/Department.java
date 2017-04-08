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
public class Department {
    private int org_id;
    private int par_id;
    private String org_name;
    private int state;

    public Department() {
    }

    public Department(int org_id, int par_id, String org_name, int state) {
        this.org_id = org_id;
        this.par_id = par_id;
        this.org_name = org_name;
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public int getPar_id() {
        return par_id;
    }

    public void setPar_id(int par_id) {
        this.par_id = par_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }
}
