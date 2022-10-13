package class20;

public class HomeWork1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    //
    //Use separate class to test your code
public int calculateArea(int side){
    return side*2;
}

    public int calculateArea(int lenght, int hiegth) {
return lenght*hiegth;
    }
    public int calculateArea(int lenght, int hiegth, int width) {

        return lenght * hiegth * width;
    }
}
class Main{
    public static void main(String[] args) {
        HomeWork1 square = new HomeWork1();
        System.out.println(square.calculateArea(5));
        System.out.println(square.calculateArea(5, 6));
        System.out.println(square.calculateArea(5, 6, 7));

    }
}
