/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

import java.io.Serializable;
import java.time.LocalDate;


public class Interview implements Serializable{
    private String name;
    private String media;
    private String date; 
    private String purpose;
    private int duration;

    public Interview(String name, String media, String date, String purpose, int duration) {
        this.name = name;
        this.media = media;
        this.date = date;
        this.purpose = purpose;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Interview{" + "name=" + name + ", media=" + media + ", date=" + date + ", purpose=" + purpose + ", duration=" + duration + '}';
    }

   
}
