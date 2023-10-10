package org.launchcode.techjobs.oo;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    // Constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Custom methods (if any)...

    // Make the class abstract to prevent direct instantiation
    // (Concrete subclasses will implement the abstract methods)
    public abstract String getLabel();

    @Override
    public String toString() {
        return getLabel() + ": " + getValue();
    }
}
