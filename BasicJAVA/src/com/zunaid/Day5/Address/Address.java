/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day5.Address;

/**
 *
 * @author DBA
 */
public class Address {
    //(id, houseNo, block, road, ps, district, addresstype)
    private int id;
    private int houseNo;
    private String block;
    private int road;
    private String ps;
    private String district;
    private AddresType addressType;

    public Address() {
    }

    public Address(int id, int houseNo, String block, int road, String ps, String district, AddresType addressType) {
        this.id = id;
        this.houseNo = houseNo;
        this.block = block;
        this.road = road;
        this.ps = ps;
        this.district = district;
        this.addressType = addressType;
    }

    public int getId() {
        return id;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getBlock() {
        return block;
    }

    public int getRoad() {
        return road;
    }

    public String getPs() {
        return ps;
    }

    public String getDistrict() {
        return district;
    }

    public AddresType getAddressType() {
        return addressType;
    }
            
    
    
    
}
