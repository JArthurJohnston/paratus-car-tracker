package com.paratusSoftware.carTracker.gasMileage;

import com.paratusSoftware.carTracker.location.Location;
import com.paratusSoftware.carTracker.location.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MileageService {

    @Autowired
    private MileageRepository mileageRepository;

    @Autowired
    private LocationRepository locationRepository;

    public MileageService(MileageRepository repository){
        this.mileageRepository = repository;
    }

    public Mileage createMileage(long latitude, long longitude, float mileage){
        Location location = locationRepository.save(new Location(latitude, longitude));
        return createMileage(new Mileage(mileage, location));
    }

    public Mileage createMileage(Mileage mileage){
        return mileageRepository.save(mileage);
    }

    public Mileage getById(int id){
        return mileageRepository.findOne(id);
    }

    public Iterable<Mileage> getAll(){
        return mileageRepository.findAll();
    }


}
