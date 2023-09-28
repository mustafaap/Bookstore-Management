/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.pkg2;

/**
 *
 * @author musta
 */
public class Member implements MemberInterface {
    private String firstName;
    private String lastName;
    private int memberId;
    private boolean premiumMember = false;
    
    public Member(String first, String last, int id, boolean isPremium){
        this.firstName = first;
        this.lastName = last;
        this.memberId = id;
        this.premiumMember = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMemberId() {
        return memberId;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
   
    
    
    
    
    
    
}
