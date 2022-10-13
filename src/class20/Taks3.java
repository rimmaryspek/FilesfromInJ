package class20;

public class Taks3 {
    /*
    Write a Java program called Teacher.
    Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */
}
class Teacher{
    protected String name;
    protected int age;
    protected int yeasOfExperience;

   Teacher(String name, int age, int yeasOfExperience){
    this.name=name;
       this.age=age;
       this.yeasOfExperience=yeasOfExperience;
   }

   void teach(){
        System.out.println(name+"is teaching");
    }
}
class MathTeacher extends Teacher{
    void teachTheClass(){
        System.out.println("I will theach even the world is going to end right after my class");
    }
    MathTeacher(String name, int age, int noOfyear){
      super(name,age,noOfyear);
    }
}
class ChemistryTeacher extends Teacher {

boolean teachOrganic;


    ChemistryTeacher(String name, int age, int yeasOfExperience) {
        super(name, age, yeasOfExperience);
    }
void teachChem(){
    System.out.println(name+ "teaching Chemistry");
}
}
class PianoTeacher extends Teacher{
String pianoType;
    PianoTeacher(String name, int age, int yeasOfExperience, String pianoType) {
        super(name, age, yeasOfExperience);
        this.pianoType=pianoType;
    }

}
class TeacherTester{
    public static void main(String[] args) {
       MathTeacher mathTeacher = new MathTeacher("Gulcan",18,5);
       mathTeacher.teachTheClass();
        PianoTeacher pianoTeacher = new PianoTeacher("James",25,5,"Grand");
       pianoTeacher.teach();
    }
}