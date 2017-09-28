package com.paratusSoftware.carTracker.util;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository<T> extends CrudRepository<T, Integer> {
}
