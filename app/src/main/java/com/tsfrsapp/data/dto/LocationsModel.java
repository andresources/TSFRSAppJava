package com.tsfrsapp.data.dto;
public class LocationsModel {
    private int id;

    private int zoneID;

    public LocationsModel(int zoneID, String zoneName, int districtID, String districtName, int mandalID, String mandalName) {
        this.zoneID = zoneID;
        this.zoneName = zoneName;
        this.districtID = districtID;
        this.districtName = districtName;
        this.mandalID = mandalID;
        this.mandalName = mandalName;
    }

    private String zoneName;

    private int districtID;

    private String districtName;

    private int mandalID;

    private String mandalName;

    public int getZoneID() {
        return zoneID;
    }

    public void setZoneID(int zoneID) {
        this.zoneID = zoneID;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getMandalID() {
        return mandalID;
    }

    public void setMandalID(int mandalID) {
        this.mandalID = mandalID;
    }

    public String getMandalName() {
        return mandalName;
    }

    public void setMandalName(String mandalName) {
        this.mandalName = mandalName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
