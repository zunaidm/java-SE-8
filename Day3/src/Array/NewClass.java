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
public class NewClass {
    public static void main(String[] args) {
        String[] items = {"Shirt","Pant","Scarft"};
        
        //print Array langth
        System.out.println("Items : " +items.length);
        //print Array Item in index
        System.out.println("Items : " +items[0]);
        System.out.println("Items : " +items[1]);
        System.out.println("Items : " +items[2]);
        
        //Print by FOR each
        for(String itm : items  ){
        System.out.println("Items FOR Each: " +itm);
        }
        //Print by FOR Loop
        for(int i = 0; i<items.length; i++){
            System.out.println("Items FOR Loop: "+items[i]);
        }
           
    }
}
