package class21;

public class Employee1 {
    double baseSalary=40000;
    double bonus= 20000;
    void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }
}
class Developer extends Employee1{
    void calculateSalary(){
        System.out.println(2*baseSalary+(1.5*bonus));
    }
}

class Test extends Employee1{
    public static void main(String[] args) {
        Developer dv =new Developer();
        dv.calculateSalary();
    }
        }

class OfficeBoy extends Employee1{

}
class Employeetester{
    public static void main(String[] args) {
        OfficeBoy officeBoy =new OfficeBoy();
        officeBoy.calculateSalary();

        Test test =new Test();
        test.calculateSalary();

        Developer developer =new Developer();
        developer.calculateSalary();

    }
}