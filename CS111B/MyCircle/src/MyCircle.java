public class MyCircle {
    private double radius;
    private double x;
    private double y;

    public void setX(double value) {
        x = value;
    }

    public double getX() {
        return x;
    }

    public void setY(double value) {
        y = value;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double value) {
        radius = value;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean doesOverlap(MyCircle otherCircle) {
        double distance = Math.sqrt(((x - otherCircle.getX()) * (x - otherCircle.getX())) +
                ((y - otherCircle.getY()) * (y - otherCircle.getY())));
        double sum = radius + otherCircle.getRadius();
        return sum > distance;
    }
}
