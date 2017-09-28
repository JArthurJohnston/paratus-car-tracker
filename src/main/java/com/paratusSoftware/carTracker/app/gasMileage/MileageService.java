package com.paratusSoftware.carTracker.app.gasMileage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MileageService {

    @Autowired
    private MileageRepository repository;

    public MileageService(MileageRepository repository){
        this.repository = repository;
    }

    public Mileage createMileage(long latitude, long longitude, float mileage){
        return createMileage(new Mileage(latitude, longitude, mileage));
    }

    public Mileage createMileage(Mileage mileage){
        return repository.save(mileage);
    }

    public Mileage getById(int id){
        return repository.findOne(id);
    }

    public Iterable<Mileage> getAll(){
        return repository.findAll();
    }


}
