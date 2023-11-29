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
    private String PatientName, PatientGender, TaskOption;    

    public New_Patient(int PatientNo, String PatientName, String PatientGender, String TaskOption) {
        this.PatientNo = PatientNo;
        this.PatientName = PatientName;
        this.PatientGender = PatientGender;
        this.TaskOption = TaskOption;
    }

    @Override
    public String toString() {
        return "New_Patient{" + "PatientNo=" + PatientNo + ", PatientName=" + PatientName + ", PatientGender=" + PatientGender + ", TaskOption=" + TaskOption + '}';
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

    public String getTaskOption() {
        return TaskOption;
    }

    public void setTaskOption(String TaskOption) {
        this.TaskOption = TaskOption;
    }
}
