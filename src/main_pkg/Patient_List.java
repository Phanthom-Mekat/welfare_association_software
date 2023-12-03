/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

public class Patient_List {
    private int PatientNo;
    private String PatientName, PatientGender,PatientCondition;

    public Patient_List(int PatientNo, String PatientName, String PatientGender, String PatientCondition) {
        this.PatientNo = PatientNo;
        this.PatientName = PatientName;
        this.PatientGender = PatientGender;
        this.PatientCondition = PatientCondition;
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

    public String getPatientCondition() {
        return PatientCondition;
    }

    public void setPatientCondition(String PatientCondition) {
        this.PatientCondition = PatientCondition;
    }

    @Override
    public String toString() {
        return "Patient_List{" + "PatientNo=" + PatientNo + ", PatientName=" + PatientName + ", PatientGender=" + PatientGender + ", PatientCondition=" + PatientCondition + '}';
    }

    
}
