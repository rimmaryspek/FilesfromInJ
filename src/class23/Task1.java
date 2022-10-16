package class23;

public class Task1 {
   /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes.
    Write example of achieving run time polymorphism.
     */
}
class Student{
    void study(){
        System.out.println("Student must study and do repl");
    }
void doHomeWork(){
    System.out.println("Student must do homework");
}
void doPractice(){
    System.out.println("Student must practice");
}
}
class SyntaxStudent extends Student{
    @Override
    void doHomeWork() {
        System.out.println("Syntax student must solve the repl thee times");
    }

    @Override
    void doPractice() {
        System.out.println("Syntax student must do there onw research and practice");

    }

}
class CollegeStudent extends Student{
    @Override
    void doPractice() {
        System.out.println("College student must get good mar");
    }
}
class SchoolStudent extends Student{

}
class StudentTester{
    public static void main(String[] args) {
        Student [] arr={new CollegeStudent(),new SchoolStudent(),new SyntaxStudent()};
        for (Student st:arr){
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}