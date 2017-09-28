package com.paratusSoftware.carTracker.app.gasMileage;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
public class Mileage {

    public static List<Mileage> allMileageEntries = new LinkedList();

    private long latitude;
    private long longitude;
    private float mileage;
    private Date timestamp;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Mileage(){
        latitude = 0;
        longitude = 0;
        mileage = 0f;
        timestamp = Calendar.getInstance().getTime();
    }

    public Mileage(long latitude, long longitude, float mileage){
        this.latitude = latitude;
        this.longitude = longitude;
        this.mileage = mileage;
    }
}
