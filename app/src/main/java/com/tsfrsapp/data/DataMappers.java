package com.tsfrsapp.data;

import com.tsfrsapp.data.dto.LocationsModel;
import com.tsfrsapp.data.remote.LocationEntity;

import java.util.ArrayList;
import java.util.List;

public class DataMappers {
    public static LocationEntity toDBLocation(LocationsModel locationsModel){
        return new LocationEntity(
                locationsModel.getZoneID(),
                locationsModel.getZoneName(),
                locationsModel.getDistrictID(),
                locationsModel.getDistrictName(),
                locationsModel.getMandalID(),
                locationsModel.getMandalName()
                );
    }
    public static List<LocationsModel> toExternalLocation(List<LocationEntity> locations){
        List<LocationsModel> locs= new ArrayList<>();
        locs.clear();
        if(locations!=null&&locations.size()>0){
            for (LocationEntity locationEntity:locations) {
                LocationsModel lm= new LocationsModel(
                        locationEntity.getZoneID(),
                        locationEntity.getZoneName(),
                        locationEntity.getDistrictID(),
                        locationEntity.getDistrictName(),
                        locationEntity.getMandalID(),
                        locationEntity.getMandalName()
                );
                locs.add(lm);
            }
        }
        return locs;
    }
}
