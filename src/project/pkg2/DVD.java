/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg2;

/**
 *
 * @author musta
 */
public class DVD extends Product {
    private String director;
    
     public DVD(String name_, double price_, int id_, String director_){
        super(name_, price_, id_);
        this.director = director_;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
     
     @Override
    public void display(){
        System.out.println("DVD name: " + this.getProductName() + " | Director: " + this.getDirector() + " | Price: " + this.getProductPrice() + "| Stock remaining: " + " | ID: " + this.getProductId());
    }
}
