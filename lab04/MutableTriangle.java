public class MutableTriangle {
    private MutablePoint a;
    private MutablePoint b;
    private MutablePoint c;

    public MutableTriangle(MutablePoint a, MutablePoint b, MutablePoint c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // #####################################
    // ############## GETTER ###############
    // #####################################

    public MutablePoint getA() {
        return new MutablePoint(a.getX(), a.getY());
    }
    
    public MutablePoint getB() {
        return new MutablePoint(b.getX(), b.getY());
    }
    
    public MutablePoint getC() {
        return new MutablePoint(c.getX(), c.getY());
    }

    // #####################################
    // ############## UTILITY ##############
    // #####################################

    public void translate(double dx, double dy) {
        this.a.translatePoint(dx, dy);
        this.b.translatePoint(dx, dy);
        this.c.translatePoint(dx, dy);
    }

    public void rotate(double theta) {
        this.a.rotate(theta);
        this.b.rotate(theta);
        this.c.rotate(theta);
    }

    public double perimeter () {
        return a.dist(b) + a.dist(c) + b.dist(c);
    }

    public double area () {
        double x = a.getX() * (b.getY() - c.getY());
        double y = b.getX() * (c.getY() - a.getY());
        double z = c.getX() * (a.getY() - b.getY());
       return Math.abs( 0.5 * (x + y + z) );
    }

}