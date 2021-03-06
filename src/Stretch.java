public class Stretch {
    private Point pointA;
    private Point pointB;

    public Stretch() {
    }

    public Stretch(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public void setA(Point a) {
        this.pointA = a;
    }

    public void setB(Point b) {
        this.pointB = b;
    }

    public Point getA() {
        return pointA;
    }

    public Point getB() {
        return pointB;
    }

    public double stretchLength() {
        return Math.sqrt(square(pointB.getX() - pointA.getX()) + square(pointB.getY() - pointA.getY()));
    }

    double square(double a) {
        return a * a;
    }
}
