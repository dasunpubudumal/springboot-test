package com.firstapp.firstapp.model;
import java.time.LocalDate;

public class Project {

    private String projectName;
    private LocalDate completedDate;
    private String developerName;

    public Project(String projectName, LocalDate completedDate, String developerName) {
        this.projectName = projectName;
        this.completedDate = completedDate;
        this.developerName = developerName;
    }

    public String getProjectName() {
        return projectName;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getDeveloperName() {
        return developerName;
    }
}
