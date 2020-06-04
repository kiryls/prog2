package lab04;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double v) {
        this(v, v);
    }

    public double getX () {return this.x;}
    
    public double getY() {return this.y;}

    public void translatePoint(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public Point translatePointSafe(double dx, double dy) {
        return new Point(this.getX() + dx, this.getY() + dy);
    }

    public void rotate(double theta) {
        this.x = this.x * Math.cos(theta) - this.y * Math.sin(theta);
        this.y = this.x * Math.sin(theta) - this.y * Math.cos(theta);
    }

    public Point rotateSafe(double theta) {
        double newX = this.x * Math.cos(theta) - this.y * Math.sin(theta);
        double newY = this.x * Math.sin(theta) - this.y * Math.cos(theta);

        return new Point(newX, newY);
    }

    public double dist (Point p) {
        double deltaX2 = (this.x - p.getX()) * (this.x - p.getX());
        double deltaY2 = (this.y - p.getY()) * (this.y - p.getY());
        return Math.sqrt(deltaX2 + deltaY2);
    }
}