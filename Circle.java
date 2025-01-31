package com.company;

import static java.lang.StrictMath.PI;

public class Circle extends Shape {

    protected Point center;
    protected double radius;

    public Circle(String name, Point center, int radius) {
        super(name);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

    public double Area() {
        return PI*Math.pow(this.radius,2);
    }

    public double Pri() {
        return PI*2*this.radius;
    }


}


