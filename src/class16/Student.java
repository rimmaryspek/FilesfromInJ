package class16;

public class Student {
    String name;
    String id;
   static int numberofstudent;

    public static void main(String[] args) {

        Student roman = new Student();
        roman.id="1";
        roman.name="Roman";
        Student.numberofstudent++;// counting


        Student sonam = new Student();
        sonam.id="2";
        sonam.name="Roman";
        Student.numberofstudent++;// counting

        System.out.println(Student.numberofstudent);
        System.out.println(Student.numberofstudent);

    }

}
