/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_pkg;

/**
 *
 * @author Asus
 */
public class Accepted_Task {
    private int Task;
    private String TaskName, TaskStatus;

    @Override
    public String toString() {
        return "Accepted_Task{" + "Task=" + Task + ", TaskName=" + TaskName + ", TaskStatus=" + TaskStatus + '}';
    }

    public int getTask() {
        return Task;
    }

    public void setTask(int Task) {
        this.Task = Task;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public Accepted_Task(int Task, String TaskName, String TaskStatus) {
        this.Task = Task;
        this.TaskName = TaskName;
        this.TaskStatus = TaskStatus;
    }

}