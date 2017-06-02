package com.jbt.dto;

import com.jbt.model.Address;
import com.jbt.model.CompanyType;
import com.jbt.model.Person;

import java.util.HashSet;
import java.util.Set;


public class CompanyDTO {

    private String name;

    private String address;

    private String type;

    private String[] workers;

    public CompanyDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getWorkers() {
        return workers;
    }

    public void setWorkers(String[] workers) {
        this.workers = workers;
    }
}
