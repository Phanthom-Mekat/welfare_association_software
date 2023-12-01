/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author Asus
 */
public class Task {

    static void setData(Task selectedTask) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int TaskNo;
    private String TaskName, TaskDetails;
    
    @Override
    public String toString() {
        return "Task{" + "TaskNo=" + TaskNo + ", TaskName=" + TaskName + ", TaskDetails=" + TaskDetails + '}';
    }
    

    public Task(int TaskNo, String TaskName, String TaskDetails) {
        this.TaskNo = TaskNo;
        this.TaskName = TaskName;
        this.TaskDetails = TaskDetails;
    }

    public int getTaskNo() {
        return TaskNo;
    }

    public void setTaskNo(int TaskNo) {
        this.TaskNo = TaskNo;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public String getTaskDetails() {
        return TaskDetails;
    }

    public void setTaskDetails(String TaskDetails) {
        this.TaskDetails = TaskDetails;
    }


}