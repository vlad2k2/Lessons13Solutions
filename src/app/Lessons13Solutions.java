package app;

import app.models.Circle;
import app.models.Square;
import app.models.Triangle;
import app.service.GeometricShape;

import java.util.Scanner;

public class Lessons13Solutions {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть радіус для розрахунку площі кола: " );
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("площа кола: " + circle.AreaFigure());

        System.out.println();

        System.out.print("Площа трикутника. Введіть висоту трикутника: " );
        double h = scanner.nextDouble();
        System.out.print("Площа трикутника. Введіть сторону трикутника: " );
        double a = scanner.nextDouble();
        Triangle triangle = new Triangle(a, h);
        System.out.println("Площа трикутника: " + triangle.AreaFigure());

        System.out.println();

        System.out.print("Площа квадрата. Введіть сторону квадрата: ");
        double x = scanner.nextDouble();
        Square square = new Square(x);
        System.out.println("Площа квадрата: " + square.AreaFigure());

        System.out.println();

        // Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві

        GeometricShape[] areas = {circle, triangle, square};

        System.out.println("Сумарна площа всіх фігур: " + calculateTotalArea(areas));

    }

    public static double calculateTotalArea(GeometricShape[] areas) {
        double totalArea = 0;
        for (GeometricShape shape : areas) {
            totalArea += shape.AreaFigure();
        }
        return totalArea;
    }

}
