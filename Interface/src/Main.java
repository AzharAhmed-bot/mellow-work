public class Main implements Calculation {
    int height;
    int width;

    public Main(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea(){
        double result=this.height * this.width;
        return result;
    }
    @Override
    public int getPerimeter(){
        int result=2*(this.width + this.height);
        return result;
    }
    public static void main(String[] args) {
        Main rectangle1=new Main(5, 10);
        System.out.println("The area of the rectangle is " + rectangle1.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle1.getPerimeter());

    }
}
