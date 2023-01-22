package day9.task2;

public class Triangle extends Figure {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double p = (sideA + sideB + sideC) / 2;
        double s = p * (p - sideA) * (p - sideB) * (p - sideC);
        return Math.sqrt(s);
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
