package lab04;


public class MutablePoint {
    private double x;
    private double y;

    public MutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MutablePoint(double v) {
        this(v, v);
    }

    // #####################################
    // ############## GETTER ###############
    // #####################################

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // #####################################
    // ############## UTILITY ##############
    // #####################################

    public void translatePoint(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public void rotate(double theta) {
        this.x = this.x * Math.cos(theta) - this.y * Math.sin(theta);
        this.y = this.x * Math.sin(theta) - this.y * Math.cos(theta);
    }

    public double dist(MutablePoint p) {
        double deltaX2 = (this.x - p.getX()) * (this.x - p.getX());
        double deltaY2 = (this.y - p.getY()) * (this.y - p.getY());
        return Math.sqrt(deltaX2 + deltaY2);
    }
}