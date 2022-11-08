package class26;

import java.util.HashSet;

public class HWStudent {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID.
        Display name of each student.
         */
        Student S1 =new Student("Rimma","12");
        Student S2 =new Student("Rimm","123");
        Student S3 =new Student("Rim","1234");
        Student S4 =new Student("Ri","123456");
        HashSet<Student> studentType= new HashSet<>();
        studentType.add(S1);
        studentType.add(S2);
        studentType.add(S3);
        studentType.add(S4);
        for (var student:studentType){
            System.out.println(student.DisplayName());
        }
    }
}
class Student{
    String StudentNane;
    String StudentID;

    public Student(String studentNane, String studentID) {
        StudentNane = studentNane;
        StudentID = studentID;
    }
    String DisplayName(){
        return StudentNane;
    }
}

