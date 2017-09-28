package com.paratusSoftware.carTracker.app.gasMileage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Mileage getWithId(@PathVariable("id") int id){
        return service.getById(id);
    }
}
