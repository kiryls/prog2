package lab04;


public class ImmutableTriangle {
    private ImmutablePoint a;
    private ImmutablePoint b;
    private ImmutablePoint c;

    public ImmutableTriangle(ImmutablePoint a, ImmutablePoint b, ImmutablePoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // #####################################
    // ############## GETTER ###############
    // #####################################

    public ImmutablePoint getA() {
        return new ImmutablePoint(a.getX(), a.getY());
    }

    public ImmutablePoint getB() {
        return new ImmutablePoint(b.getX(), b.getY());
    }

    public ImmutablePoint getC() {
        return new ImmutablePoint(c.getX(), c.getY());
    }

    // #####################################
    // ############## UTILITY ##############
    // #####################################

    public ImmutableTriangle translate(double dx, double dy) {
        ImmutableTriangle tr = new ImmutableTriangle(this.a.translatePoint(dx, dy), 
                                                    this.b.translatePoint(dx, dy), 
                                                    this.c.translatePoint(dx, dy));
        return tr;
    }

    public ImmutableTriangle rotate(double theta) {
        ImmutableTriangle tr = new ImmutableTriangle(this.a.rotate(theta), 
                                                    this.b.rotate(theta), 
                                                    this.c.rotate(theta));
        return tr;
    }

    public double perimeter() {
        return a.dist(b) + a.dist(c) + b.dist(c);
    }

    public double area() {
        double x = a.getX() * (b.getY() - c.getY());
        double y = b.getX() * (c.getY() - a.getY());
        double z = c.getX() * (a.getY() - b.getY());
        return Math.abs(0.5 * (x + y + z));
    }

}