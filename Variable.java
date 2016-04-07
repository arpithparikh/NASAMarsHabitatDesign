package com.marsHousing;

public class Variable {
    private double value;
    private Status color;
    
    
    
    public Variable(double value, Status color) {
        this.value = value;
        this.color = color;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public Status getColor() {
        return color;
    }
    public void setColor(Status color) {
        this.color = color;
    }
    
    
}
