package Review14Exeptions;

public class ExeptionDemo1 {
    public static void main(String[] args) throws AgeNotAllowed {
        int age=15;

        if(age<18){
            throw new AgeNotAllowed("You should not be here");
        }
    }
}
