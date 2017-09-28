package com.paratusSoftware.carTracker.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicService<T> {

    protected final BasicRepository<T> repository;

    @Autowired
    public BasicService(BasicRepository<T> repository){
        this.repository = repository;
    }

    public T create(T model){
        return repository.save(model);
    }

    public T read(int id){
        return repository.findOne(id);
    }

    public Iterable<T> readAll(){
        return repository.findAll();
    }

    public void destroy(T model){
        repository.delete(model);
    }
}
