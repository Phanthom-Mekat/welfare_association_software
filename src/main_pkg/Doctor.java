/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author Asus
 */
public class Doctor {
    
    private int DoctorSerial;
    private String DoctorName, AppointmentDate,AppointTime;

    @Override
    public String toString() {
        return "Doctor{" + "DoctorSerial=" + DoctorSerial + ", DoctorName=" + DoctorName + ", AppointmentDate=" + AppointmentDate + ", AppointTime=" + AppointTime + '}';
    }

    public int getDoctorSerial() {
        return DoctorSerial;
    }

    public void setDoctorSerial(int DoctorSerial) {
        this.DoctorSerial = DoctorSerial;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(String AppointmentDate) {
        this.AppointmentDate = AppointmentDate;
    }

    public String getAppointTime() {
        return AppointTime;
    }

    public void setAppointTime(String AppointTime) {
        this.AppointTime = AppointTime;
    }

    public Doctor(int DoctorSerial, String DoctorName, String AppointmentDate, String AppointTime) {
        this.DoctorSerial = DoctorSerial;
        this.DoctorName = DoctorName;
        this.AppointmentDate = AppointmentDate;
        this.AppointTime = AppointTime;
    }

}
