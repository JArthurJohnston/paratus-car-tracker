package com.paratusSoftware.carTracker.gasMileage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mileage")
public class MileageController {

    private MileageService service;

    @Autowired
    public MileageController(MileageService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public void addMileage(@RequestBody Mileage mileage){
        service.createMileage(mileage);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public Iterable<Mileage> allMileages(){
        return service.getAll();
    }

}
