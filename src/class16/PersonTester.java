package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        //System.out.println(person.password); no access
        System.out.println(person.salary);// will have access in same packaje
    }
}
