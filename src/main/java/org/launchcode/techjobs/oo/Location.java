package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location {

    private int id;
    private static int nextId = 1;
    private String value;

    // First constructor to initialize id field
    public Location() {
        id = nextId;
        nextId++;
    }

    // Second constructor as per the TODO comment
    public Location(String value) {
        this(); // Call the empty constructor to initialize the id field
        this.value = value; // Initialize the value field
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
