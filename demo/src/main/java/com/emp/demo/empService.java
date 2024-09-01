package com.emp.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class empService {

    @Autowired
    private empRepository repo;

    public emp saveemp(emp e) {


        return repo.save(e);

    }

    public List<emp> find() {
        return repo.findAll();
    }

    public void removebook(int id) {
        repo.deleteById(id);
    }

    public emp editemp(emp obj, int id) {
        Optional<emp> eid = repo.findById(id);
        emp eidd = eid.get();
        System.out.println(eidd);;
        eidd.setName(obj.getName());
        eidd.setYear(obj.getYear());
        return repo.save(eidd);

    }
}