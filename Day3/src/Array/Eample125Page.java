/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author DBA
 */
public class Eample125Page {
    static boolean result = false;
    public static void main(String[] args) {
        String[] mem = {"Rahim","karim","jabbar","mofiz"};
        getRs(mem);
    }
    public static void getRs(String[] ar) {
        if(ar.length>=4){
            result = true;
            System.out.println(result);
        }
        else {
            System.out.println(result);
        }
        
    }
    
}
