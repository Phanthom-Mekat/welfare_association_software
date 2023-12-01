/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author nirjharsikder
 */
public class User_1_MemberDirectory {
    private String name,Posts;

    public User_1_MemberDirectory(String name, String Posts) {
        this.name = name;
        this.Posts = Posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosts() {
        return Posts;
    }

    public void setPosts(String Posts) {
        this.Posts = Posts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User_1_MemberDirectory{");
        sb.append("name=").append(name);
        sb.append(", Posts=").append(Posts);
        sb.append('}');
        return sb.toString();
    }
    
    
}
