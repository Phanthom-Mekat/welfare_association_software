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
    private int TaskNo;
    private String TaskName, TaskDetails, TaskOption;

    @Override
    public String toString() {
        return "Task{" + "TaskNo=" + TaskNo + ", TaskName=" + TaskName + ", TaskDetails=" + TaskDetails + ", TaskOption=" + TaskOption + '}';
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

    public String getTaskOption() {
        return TaskOption;
    }

    public void setTaskOption(String TaskOption) {
        this.TaskOption = TaskOption;
    }

    public Task(int TaskNo, String TaskName, String TaskDetails, String TaskOption) {
        this.TaskNo = TaskNo;
        this.TaskName = TaskName;
        this.TaskDetails = TaskDetails;
        this.TaskOption = TaskOption;
    }

}