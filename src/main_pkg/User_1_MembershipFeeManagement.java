/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author nirjharsikder
 */
public class User_1_MembershipFeeManagement {
    
    private String name,post;
    private int Fee;

    public User_1_MembershipFeeManagement(String name, String post, int Fee) {
        this.name = name;
        this.post = post;
        this.Fee = Fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getFee() {
        return Fee;
    }

    public void setFee(int Fee) {
        this.Fee = Fee;
    }

    @Override
    public String toString() {
        return "User_1_MembershipFeeManagement{" + "name=" + name + ", post=" + post + ", Fee=" + Fee + '}';
    }
    
    
}
