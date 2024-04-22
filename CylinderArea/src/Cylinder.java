public class Cylinder extends Circle {

    private int height;
    public Cylinder(double radius,int height) {
        super(radius);
        this.height=height;
    }

    public double getArea(){
        return (2* super.getArea()) + (Math.PI* super.radius * 2 * this.height);
    }
    public double getPerimeter(){
        return (4*super.getPerimeter()) + (2*this.height) ;
    }

}
