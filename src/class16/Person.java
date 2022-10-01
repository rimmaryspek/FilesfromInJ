package class16;

public class Person {
    /*
     Private method is accesible only for the class
     Defoult
    */

    private String password= "pass123";
    double salary=1000;

    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);
    }
}
