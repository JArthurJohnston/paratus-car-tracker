package com.paratusSoftware.carTracker.app.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarRepository repository;

    @Autowired
    public CarService(CarRepository repository){
        this.repository = repository;
    }

    public Iterable<Car> getAll(){
        return repository.findAll();
    }

    public Car getById(int id){
        return repository.findOne(id);
    }

    public Car create(Car carToCreate){
        return repository.save(carToCreate);
    }
}
