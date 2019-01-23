package com.company;

public class Circle {

    private double circDiameter;

    public void setDiameter (int objectDiameter) {
        circDiameter = objectDiameter;
    }

    public double getDiameter() {
        return circDiameter;
    }

    public double getRadius() {
        return ((circDiameter/2));
    }

    public double getCircArea() {
        return Math.pow((circDiameter/2),2) * 3.14;
    }

    public double getCircumference() {
        return ((circDiameter/2)*2*3.14);
    }

}
