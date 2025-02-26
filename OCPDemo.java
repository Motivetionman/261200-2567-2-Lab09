public class OCPDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(4, 5),
            new Circle(3),
            new Ellipse(4, 2)
        };

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: " + calculator.calculateTotalArea(shapes));
    }
}