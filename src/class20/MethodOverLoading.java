package class20;

public class MethodOverLoading {
    /*  static void addInt(int num1,int num2){ ------------------this method repeathing too many times
          System.out.println(num1+num2);
      }
     static void addDouble(double num1,double num2){
          System.out.println(num1+num2);
      }
  static void addThreeDouble(double num1,double num2, double num3){
          System.out.println(num1+num2+num3);
      }
        public static void main(String[] args) {
        //  addInt(10.84,56.68,) we can do this cuz it is not the same data type
      addDouble(10.6,30);
    }
  }
  */
   int number;
   double dNumber;
   MethodOverLoading(){ // for constructors

   }
   MethodOverLoading(int number){ // for constructors

   }
   MethodOverLoading(double dNumber){//for constructors

   }
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);

    }

    static void add(double num1, double num2, double num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void main(String[] args) {
        add(20,20);
        add(20,30,40);
        add(30,40,50);
       new MethodOverLoading(45);// calling for constructors

    }
}