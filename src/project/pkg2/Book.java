/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg2;

/**
 *
 * @author musta
 */
public class Book extends Product {
    private String author;
    
    public Book(String name_, double price_, int id_, String author_){
        super(name_, price_, id_);
        this.author = author_;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public void display(){
        System.out.println("Book name: " + this.getProductName() + " | Author: " +  this.getAuthor() + " | Price: " + this.getProductPrice() + " | ID: " + this.getProductId());
    }
    
    
}
