package com.paratusSoftware.carTracker.location;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
public class Location {

    public static final Location NULL = new Location(-1, -1);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Setter
    private long latitude, longitude;

    public Location(long latitude, long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
