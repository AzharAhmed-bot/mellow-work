public class App extends Triangle{
    public App(int sideA, int sideB ,int SideC){
        super(sideA, sideB, SideC);
    }
    @Override
    public int getPerimeter(){
        int result=sideA+sideB+sideC;
        return result;

    }
    public static void main(String[] args) {
        App newApplication=new App(3,4,5);
        System.out.println("The perimeters of the triangle is "+newApplication.getPerimeter());
    }

}
