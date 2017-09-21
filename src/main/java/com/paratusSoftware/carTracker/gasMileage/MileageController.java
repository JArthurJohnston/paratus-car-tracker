package com.paratusSoftware.carTracker.gasMileage;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mileage")
public class MileageController {

    @RequestMapping(method = RequestMethod.GET, path = "/reflect")
    public Mileage reflectMileage(@RequestParam(value = "latitude", defaultValue = "9999") long latitude,
                                  @RequestParam(value = "longitude", defaultValue = "8888") long longitude,
                                  @RequestParam(value = "mileage", defaultValue = "77.66") float mileage){
        return new Mileage(latitude, longitude, mileage);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public void addMileage(@RequestBody Mileage mileage){
        Mileage.allMileageEntries.add(mileage);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public List<Mileage> allMileages(@RequestParam(value = "latitude", defaultValue = "9999") long latitude,
                                     @RequestParam(value = "longitude", defaultValue = "8888") long longitude,
                                     @RequestParam(value = "mileage", defaultValue = "77.66") float mileage){
        return Mileage.allMileageEntries;
    }

}
