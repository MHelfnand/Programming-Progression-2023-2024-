package com.company;


public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
     public boolean isTriangle(){
         boolean A = ((this.side1 + this.side2) > this.side3);
         boolean B = ((this.side2 + this.side3) > this.side1);
         boolean C = ((this.side1 + this.side3) > this.side2);
         return A && B && C;


     }
    public double Area() {
        double P= (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(P*(P-this.side1)*(P-this.side2)*(P-this.side3)) ;
    }


    public double Pri() {
        return this.side1+this.side2+this.side3;
    }

    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", name='" + name +"', Is Triangle: "+ isTriangle() +'\'' +
                '}';
    }
}
