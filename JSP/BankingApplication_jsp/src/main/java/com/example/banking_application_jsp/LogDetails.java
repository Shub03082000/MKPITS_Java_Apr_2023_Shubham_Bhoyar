package com.example.banking_application_jsp;

import java.sql.Timestamp;

public class LogDetails {
    private Timestamp logTime;
    private String task;
    private String userId;

    public LogDetails(){

    }

    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
