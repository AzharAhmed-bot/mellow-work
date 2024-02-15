public class Circle {

    protected double radius;

    //Class constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String args[]){

        Circle firstCircle=new Circle(20);
        double Area= firstCircle.getArea();
        System.out.println(Area);
    }
}