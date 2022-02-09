package com.company;

public class Circle {

    private final double PI = 3.14;
    private int radius;

    public Circle( int radius) {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

   public static void area(){
       System.out.println(Math.PI * (12 * 12));
    }

   public static void circumference() {
       System.out.println(2 * Math.PI * 12);
    }
}
