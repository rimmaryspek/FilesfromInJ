package Object;

public class Charac {
    void numbers(int num, int i) {
        for (int j = 1; j < 11; j++) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Charac obj = new Charac();
        obj.numbers(1,10);

    }
}