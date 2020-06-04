package lab04;


public class ImmutablePoint {
    private double x;
    private double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(double v) {
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

    public ImmutablePoint translatePoint(double dx, double dy) {
        return new ImmutablePoint(this.getX() + dx, this.getY() + dy);
    }

    public ImmutablePoint rotate(double theta) {
        double newX = this.x * Math.cos(theta) - this.y * Math.sin(theta);
        double newY = this.x * Math.sin(theta) - this.y * Math.cos(theta);

        return new ImmutablePoint(newX, newY);
    }

    public double dist(ImmutablePoint p) {
        double deltaX2 = (this.x - p.getX()) * (this.x - p.getX());
        double deltaY2 = (this.y - p.getY()) * (this.y - p.getY());
        return Math.sqrt(deltaX2 + deltaY2);
    }
}