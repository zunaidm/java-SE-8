
package com.zunaid.Day6.practice.product;


public class Products {
    private int id ;
    private String productName;
    private int quantity;
    private int unitPrice;
    private int totalPrice;
    private String brandName;
    private boolean avilable;
    public Products() {
    }

    public Products(int id, String productName, int quantity, int unitPrice, String brandName, boolean avilable) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.brandName = brandName;
        this.avilable = avilable;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return quantity*unitPrice;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public boolean status(){
    return avilable ;
    }
}
