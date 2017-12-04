/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.Day6.practice.product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DBA
 */
public class App {
    public static void main(String[] args) {
        List<Products> product1 = new ArrayList<>();
        product1.add(new Products(1,"Mobile",2,5000,"Samsung",true));
        product1.add(new Products(2," Fridge",3,10000,"Samsung",false));
        product1.add(new Products(3," TV",4,7000,"Samsung",true));
        
        product1.add(new Products(4,"Mobile",2,5000,"ASUS",false));
        product1.add(new Products(5," LAPTOP",3,20000,"ASUS",true));
        product1.add(new Products(6," PC",4,70000,"ASUS",false));
        
        displayByBrand(product1, "Samsung");
        
    }
    private static void displayByBrand(List<Products> productses,String name){
        for(Products p:productses){
           if(p.status() && p.getBrandName().equals(name))
            System.out.println("ID : "+p.getId()
                               +"Product Name : "+p.getProductName()
                               +"Quantity : "+p.getQuantity()
                               +"Unit Price : "+p.getUnitPrice()
                               +"TotalPrice : " +p.getTotalPrice()
                               +"Brand Name: " +p.getBrandName()
                               +" Avilable : " +p.status()
                        );
            }
    }
}
