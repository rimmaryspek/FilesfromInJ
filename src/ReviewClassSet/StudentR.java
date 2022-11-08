package ReviewClassSet;

import java.util.ArrayList;
import java.util.Objects;

public class StudentR {
    private String firstName;
    private String lastName;
    private String rollNumber;

    public StudentR(String firstName, String lastName, String rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
    }
// how we can remove elements and accsess from the student class
    /*
    /*
    if we don't override this method java by default checks the address only
    to figure out if two objects are same or not
     */

    void printname(){
        System.out.println(firstName+" "+lastName);
    }

    @Override
    public String toString() {
        return "StudentR{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, rollNumber);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentR studentR = (StudentR) o;
        return Objects.equals(firstName, studentR.firstName) && Objects.equals(lastName, studentR.lastName) && Objects.equals(rollNumber, studentR.rollNumber);
    }
}

    class ListDemoCustomClass{
        // if you need to store objects of the Student class always use ArrayList
        public static void main(String[] args) {
            ArrayList<StudentR> studentRS = new ArrayList<>();
            studentRS.add(new StudentR("Josh","Plath","123"));
            studentRS.add(new StudentR("Josh1","Plath1","1234"));
            studentRS.add(new StudentR("Josh2","Plath2","12356"));
          //  System.out.println(studentRS);// to print the element  we need to override the elements
            // with the help of Todo keyword line 18
            // how we can remove elements and accsess from the Student class
            // coming up next how we can remove elements how we can access methods from a class

            // for (StudentR studentR : studentRS) {
              // studentR.printname();//calling printName metod from student class
        //  }

StudentR studentR = new StudentR("Josh","Plath","123");
            System.out.println(studentRS.contains(studentR));
            System.out.println(studentRS);
            System.out.println(studentR);


            }

        }







