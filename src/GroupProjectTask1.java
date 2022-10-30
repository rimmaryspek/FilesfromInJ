class GPtask2 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */
    public static void main(String[] args) {
        Shape [] s={new Circle(5,6,7),new square(5)};
        for (Shape math : s) {
            System.out.println();
            math.calculateArea();
            math.calculateParameter();
        }
    }
}
interface Shape{
    void calculateArea();
    void calculateParameter();
}
class Circle implements Shape{
    double lenght;
    double w;
    double r;
    Circle(double lenght, double w, double r){
        this.lenght=lenght;
        this.w=w;
        this.r=r;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area circle "+ (lenght*w));
    }

    @Override
    public void calculateParameter() {
        System.out.println("the parameters of " + (2*Math.PI*r));
    }
}
class square implements Shape{
int l;
square(int l){
    this.l=l;
}

    @Override
    public void calculateArea() {
        System.out.println("The area of square "+ (l*2));
    }

    @Override
    public void calculateParameter() {
        System.out.println("The parameter of square "+ (l*4));
    }
}