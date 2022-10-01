package Object;

public class Numbers {
// counting numbers till 1-10.
    void numbers(int num){
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
    public static void main (String []args) {
        Numbers obj = new Numbers();
        obj.numbers(10);

    }
    }