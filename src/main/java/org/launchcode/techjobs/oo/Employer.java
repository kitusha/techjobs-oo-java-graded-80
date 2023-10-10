package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    private String value;

    // Constructors for Employer ...

    public Employer(String value) {
        super();
        this.value = value;
    }

    //  toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getLabel() {
        return "Employer";
    }
}
