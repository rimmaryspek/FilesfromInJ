package class17;

public class HomeWork3 {
   //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and
    // create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.
    private String name;
  private String lastname;
  private int age;
  private double height;
  private double weight;
  private boolean isEducated;
   String degree;
   private HomeWork3(String pname,String plastname){
       name =plastname;
       lastname=plastname;
   }
   public HomeWork3(int page){

       age=page;
   }
   HomeWork3 (double pheight, double pweight,boolean pisEducated){
  height=pheight;
  weight=pweight;
  isEducated=pisEducated;
   }
  protected HomeWork3(){

}
  void info(){
    System.out.println(name + lastname);
}

void printinfo(){
       if(isEducated){
           System.out.println("height:" + height+ "weight:" + weight);
       }else{
           System.out.println("no onfo");
       }
}
private String ageinfo(){
       if (age<=10 && age >=13){
           return "you are teen";
       }else {
           return "not a teen";
       }
}

public static void main(String[] args) {

        HomeWork3 person = new HomeWork3("rimma", "ryspek");
       // person.lastname();
    }
}
