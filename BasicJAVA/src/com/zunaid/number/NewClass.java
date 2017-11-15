/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.number;

/**
 *
 * @author DBA
 */
public class NewClass {
    static int a=10;
    static double b=10;
    static  String st = "100";
    public static void main(String[] args) {
        double x=a*b;
        //int x = a*b; Error
        System.out.println("Total "+x);
        int n = Integer.parseInt(st);
        System.out.println("String "+n);
    }
    
    
}
