abstract class Triangle {
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB,int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC=sideC;
    }
    abstract int getPerimeter();
}



