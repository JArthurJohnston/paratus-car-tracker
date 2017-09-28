package com.paratusSoftware.carTracker.app.gasMileage;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MileageRepository extends CrudRepository<Mileage, Integer>{
}
