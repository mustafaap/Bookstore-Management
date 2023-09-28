/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg2;

/**
 *
 * @author musta
 */
public class CD extends Product{
    private String artist;
    
    public CD(String name_, double price_, int id_, String artist_){
        super(name_, price_, id_);
        this.artist = artist_;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    @Override
    public void display(){
        System.out.println("CD name: " + this.getProductName() + " | Artist: " + this.getArtist() + " | Price: " + this.getProductPrice() + " | ID: " + this.getProductId());
    }
    
    
}
