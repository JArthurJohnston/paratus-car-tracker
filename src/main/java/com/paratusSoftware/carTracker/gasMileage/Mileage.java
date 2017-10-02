package com.paratusSoftware.carTracker.gasMileage;

import com.paratusSoftware.carTracker.location.Location;
import lombok.Getter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
public class Mileage {

    @OneToOne
    @JoinColumn(name = "id")
    private Location location;

    private float miles;
    private Date timestamp;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Mileage(){
        miles = 0f;
        timestamp = Calendar.getInstance().getTime();
        location = Location.NULL;
    }

    public Mileage(float mileage, Location location){
        this.location = location;
        this.miles = mileage;
    }
}
