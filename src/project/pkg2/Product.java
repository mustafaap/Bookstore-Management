/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg2;

/**
 *
 * @author musta
 */
public abstract class Product {
    private String productName;
    private int productId;
    private double productPrice;
    
    public Product(String name_, double price_, int id_){
        this.productName = name_;
        this.productId = id_;
        this.productPrice = price_;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    public abstract void display();
    
    
}
