/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5.details;

/**
 *
 * @author Zunaid
 */
public class EmployeeDetails {
    //-Signle Object :: (id, hobby, bloodGroup, nationality, religion)
    private int id;
    private String hobby;
    private BloodGroup bloodGroup;
    private Nationality nationality;
    private Religion religion;

    public EmployeeDetails() {
    }

    public EmployeeDetails(int id, String hobby, BloodGroup bloodGroup, Nationality nationality, Religion religion) {
        this.id = id;
        this.hobby = hobby;
        this.bloodGroup = bloodGroup;
        this.nationality = nationality;
        this.religion = religion;
    }

    public int getId() {
        return id;
    }

    public String getHobby() {
        return hobby;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Religion getReligion() {
        return religion;
    }
    
    
}
