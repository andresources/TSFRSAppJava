package com.tsfrsapp.ui.model;
public class DistrictWiseCompletedSchoolModel {
    private String Mandal;
    private int NoOfVillages;
    private int NoOfSchools;

    public DistrictWiseCompletedSchoolModel(String mandal, int noOfVillages, int noOfSchools, float completedPer) {
        Mandal = mandal;
        NoOfVillages = noOfVillages;
        NoOfSchools = noOfSchools;
        CompletedPer = completedPer;
    }

    private float CompletedPer;

    public String getMandal() {
        return Mandal;
    }

    public void setMandal(String mandal) {
        Mandal = mandal;
    }

    public int getNoOfVillages() {
        return NoOfVillages;
    }

    public void setNoOfVillages(int noOfVillages) {
        NoOfVillages = noOfVillages;
    }

    public int getNoOfSchools() {
        return NoOfSchools;
    }

    public void setNoOfSchools(int noOfSchools) {
        NoOfSchools = noOfSchools;
    }

    public float getCompletedPer() {
        return CompletedPer;
    }

    public void setCompletedPer(float completedPer) {
        CompletedPer = completedPer;
    }


}
