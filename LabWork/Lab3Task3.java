public class Circle {
    private double radius;
    private double x;
    private double y;

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void position() {
        System.out.println("Position of the circle is (" + x + ", " + y + ")");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
