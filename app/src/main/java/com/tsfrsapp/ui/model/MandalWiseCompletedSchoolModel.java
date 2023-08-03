package com.tsfrsapp.ui.model;

public class MandalWiseCompletedSchoolModel {
    private String Village;
    private int NoOfSchools;
    private int NoOfStudents;

    public MandalWiseCompletedSchoolModel(String village, int noOfSchools, int noOfStudents, float completedPer) {
        Village = village;
        NoOfSchools = noOfSchools;
        NoOfStudents = noOfStudents;
        CompletedPer = completedPer;
    }

    private float CompletedPer;

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public int getNoOfSchools() {
        return NoOfSchools;
    }

    public void setNoOfSchools(int noOfSchools) {
        NoOfSchools = noOfSchools;
    }

    public int getNoOfStudents() {
        return NoOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        NoOfStudents = noOfStudents;
    }

    public float getCompletedPer() {
        return CompletedPer;
    }

    public void setCompletedPer(float completedPer) {
        CompletedPer = completedPer;
    }
}
