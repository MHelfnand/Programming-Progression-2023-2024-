package com.company;

public class Cylinder extends Circle {

    protected int height;

    public Cylinder(String name, Point center, int radius, int height) {
        super(name, center, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getArea(){
        return 2*super.Area()+super.Pri()*this.height;
    }
    public double getVolume(){
        return super.Area()*this.height;
    }


    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", center=" + "("+center.getx()+", "+ center.gety()+")" +
                ", radius=" + radius +
                '}';
    }
}
