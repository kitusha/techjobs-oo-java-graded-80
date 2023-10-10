package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // First constructor to initialize a unique ID
    public Job() {
        id = nextId;
        nextId++;
    }

    // Second constructor to initialize all fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Call the first constructor to initialize the id field
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //  equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + (name.isEmpty() ? "Data not available" : name) + System.lineSeparator() +
                "Employer: " + (employer == null ? "Data not available" : employer.getValue()) + System.lineSeparator() +
                "Location: " + (location == null ? "Data not available" : location.getValue()) + System.lineSeparator() +
                "Position Type: " + (positionType == null ? "Data not available" : positionType.getValue()) + System.lineSeparator() +
                "Core Competency: " + (coreCompetency == null ? "Data not available" : coreCompetency.getValue()) +
                System.lineSeparator();
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
