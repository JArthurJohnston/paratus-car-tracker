package com.paratusSoftware.carTracker.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("locations")
public class LocationController {
    @Autowired
    private LocationRepository repository;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public Iterable<Location> all(){
        return repository.findAll();
    }
}
