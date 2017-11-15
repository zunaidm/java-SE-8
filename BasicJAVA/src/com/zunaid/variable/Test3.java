/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zunaid.variable;

/**
 *
 * @author DBA
 */
public class Test3 {
    private static int x=10,y=20,z;

    
    public static void main(String[] args) {
        z=x;
        x=y;
        y=z;
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
}
