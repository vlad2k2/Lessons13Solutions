package app.models;

import app.service.GeometricShape;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double AreaFigure() {
        return side * side;
    }
}
