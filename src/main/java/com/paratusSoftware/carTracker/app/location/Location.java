package com.paratusSoftware.carTracker.app.location;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Location {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Setter
    private int latitude, longitude;

}
