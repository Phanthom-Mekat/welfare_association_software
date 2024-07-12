/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author Asus
 */
public class New_Patient {
    private int PatientNo;
    private String PatientName, PatientGender, PatientDetails;    

    public New_Patient(int PatientNo, String PatientName, String PatientGender, String PatientDetails) {
        this.PatientNo = PatientNo;
        this.PatientName = PatientName;
        this.PatientGender = PatientGender;
        this.PatientDetails = PatientDetails;
    }

    @Override
    public String toString() {
        return "New_Patient{" + "PatientNo=" + PatientNo + ", PatientName=" + PatientName + ", PatientGender=" + PatientGender + ", PatientDetails=" + PatientDetails + '}';
    }

    public int getPatientNo() {
        return PatientNo;
    }

    public void setPatientNo(int PatientNo) {
        this.PatientNo = PatientNo;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientGender() {
        return PatientGender;
    }

    public void setPatientGender(String PatientGender) {
        this.PatientGender = PatientGender;
    }

    public String getPatientDetails() {
        return PatientDetails;
    }

    public void setPatientDetails(String PatientDetails) {
        this.PatientDetails = PatientDetails;
    }



}
