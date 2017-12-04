/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5.bank;

/**
 *
 * @author Zunaid
 */
public class BankName {
    private int id;
    private String name;
    private String address;

    public BankName() {
    }

    public BankName(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    
    
}
