package com.emp.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class emp {

    @Id
    private int id;

    @Override
    public String toString() {
        return "emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    private String name;

    private String year;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }




}
