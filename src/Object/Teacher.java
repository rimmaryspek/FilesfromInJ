package Object;

public class Teacher {
    // constructor
    String name, lastName;
    int experience;
    String subject;
    double salary;
    static String school;
    /*
     how to create constructor
    1. name of the constructor should be the same class name
    2. not return type not even void.
    */

    Teacher (String fname, String lName) {
        name = fname;
        lastName = lName;
    }
    void print() {
            System.out.println(name + lastName);
        }


}
