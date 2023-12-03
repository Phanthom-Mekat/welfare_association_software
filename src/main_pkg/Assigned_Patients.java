/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author Asus
 */
public class Assigned_Patients {
    
    private int PatientNo;
    private String PatientName, PatientGender,PatientDetailsUpdate;

    public Assigned_Patients(int PatientNo, String PatientName, String PatientGender, String PatientDetailsUpdate) {
        this.PatientNo = PatientNo;
        this.PatientName = PatientName;
        this.PatientGender = PatientGender;
        this.PatientDetailsUpdate = PatientDetailsUpdate;
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

    public String getPatientDetailsUpdate() {
        return PatientDetailsUpdate;
    }

    public void setPatientDetailsUpdate(String PatientDetailsUpdate) {
        this.PatientDetailsUpdate = PatientDetailsUpdate;
    }

    @Override
    public String toString() {
        return "Assigned_Patients{" + "PatientNo=" + PatientNo + ", PatientName=" + PatientName + ", PatientGender=" + PatientGender + ", PatientDetailsUpdate=" + PatientDetailsUpdate + '}';
    }


    
}
