package com.emp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usercontroller {

    @Autowired
    private empService emps;


    @PostMapping("/")
    public emp addemp(@RequestBody emp e){
        return emps.saveemp(e);
    }


    @GetMapping ("/getemp")
    public List<emp> getAllEmployees() {
        return emps.find();
    }

    @DeleteMapping("/remove/{id}")
    public String  remove(@PathVariable ("id") int idd)
    {  emps.removebook(idd);
       return "Records are removed";
    }

   //http response entity
    @PutMapping("/{id}")
    public ResponseEntity <emp> edit(@RequestBody emp obj, @PathVariable int id) {
         //emps.editemp(obj, id)
         return new ResponseEntity<>(emps.editemp(obj, id), HttpStatus.ACCEPTED);

    }


}
