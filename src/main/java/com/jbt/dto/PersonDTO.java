package com.jbt.dto;

import com.jbt.model.Person;

/**
 * Created by gennady.mazurkevich on 02.06.2017.
 */
public class PersonDTO {
    private String fullName;

    @Override
    public String toString() {
        return "PersonDTO{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public PersonDTO() {
    }

}
