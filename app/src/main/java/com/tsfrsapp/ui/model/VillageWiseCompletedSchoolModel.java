package com.tsfrsapp.ui.model;

public class VillageWiseCompletedSchoolModel {
    private int CompletedStatus;
    private String SchoolName;
    private String ClassName;
    private int NoOfStudents;

    public VillageWiseCompletedSchoolModel(int completedStatus, String schoolName, String className, int noOfStudents) {
        CompletedStatus = completedStatus;
        SchoolName = schoolName;
        ClassName = className;
        NoOfStudents = noOfStudents;
    }



    public int getCompletedStatus() {
        return CompletedStatus;
    }

    public void setCompletedStatus(int completedStatus) {
        CompletedStatus = completedStatus;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getNoOfStudents() {
        return NoOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        NoOfStudents = noOfStudents;
    }
}
