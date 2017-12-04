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
public class BankDetails {
    //(id, accounHolder, accountNo, bankName)
    private int id;
    private String accounHolder;
    private int accountNo;
    private BankName bankName;

    public BankDetails() {
    }

    public BankDetails(int id, String accounHolder, int accountNo, BankName bankName) {
        this.id = id;
        this.accounHolder = accounHolder;
        this.accountNo = accountNo;
        this.bankName = bankName;
    }

    public int getId() {
        return id;
    }

    public String getAccounHolder() {
        return accounHolder;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public BankName getBankName() {
        return bankName;
    }
    
    
    
           
}
