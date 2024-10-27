package app.models;

import app.service.GeometricShape;

public class Circle implements GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double AreaFigure() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
