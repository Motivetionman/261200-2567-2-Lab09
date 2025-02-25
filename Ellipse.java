class Ellipse implements Shape {
    private double majorAxis, minorAxis;
    
    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }
    
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}