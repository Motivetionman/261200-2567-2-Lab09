interface Shape {
    double getArea();
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.getArea();
    }
}

