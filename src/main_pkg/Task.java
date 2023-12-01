package main_pkg;


public class Task {
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