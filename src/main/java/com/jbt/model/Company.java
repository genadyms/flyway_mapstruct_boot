package com.jbt.model;

import java.util.HashSet;
import java.util.Set;

public class Company {

    private String name;

    private Address address;

    private CompanyType type;

    private Set<Person> workers = new HashSet<Person>();

    public void addWorker(Person person) {
        workers.add(person);
    }

    public  boolean removeWorker(Person person) {
       return  workers.remove(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CompanyType getType() {
        return type;
    }

    public void setType(CompanyType type) {
        this.type = type;
    }


}
