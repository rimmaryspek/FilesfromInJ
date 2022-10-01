package class17;

public class Emplayee {
  private  String name;
  private   String department;
  private   double salary;
   private String id;
  private   int age;
   private double actualsalary;
   static String companyname = "Syntax";
   public Emplayee (String empname, String empdepartment, double empSalary, int empage ){ // constructor method
       name=empname;
       department=empdepartment;
       salary=empSalary;
       age=empage;
   }

   void printsalary(){
       actualsalary=salary+200000+10000;
       System.out.println(actualsalary);
   }
    void calculateprintTax(){
       double tax=actualsalary*.3;
        System.out.println("tax"+tax);
    }

    public static void main(String[] args) {
        Emplayee epm1 = new Emplayee("Josh"," IT",45000,56);
        epm1.printsalary();
        epm1.calculateprintTax();
    }
}
