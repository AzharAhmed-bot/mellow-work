public class Main {
    public static void main(String args[]){

        Cylinder firstCylinder=new Cylinder(20,5);

        double area=firstCylinder.getArea();
        double perimeter=firstCylinder.getPerimeter();
        System.out.println(area);
        System.out.println(perimeter);
    }
}
