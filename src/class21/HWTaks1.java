package class21;

public class HWTaks1 {
        public static void main(String[] args) {
          //  Creditcard creditcard= new Creditcard();
          //  creditcard.calculate(1000);
           // Viza viza = new Viza();
          //  viza.calculate(100);
        }

//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance
// Create 2 subclasses: Visa and AX. In AX class override method calculate interest
// Call the method by creating an object of each of the three classes.
class Creditcard {
            double balance;
            double interest;

            void calculate(double balance){

                System.out.println(balance*0.3);
            }
        }
class Viza extends Creditcard{

}
class AX extends  Creditcard{
     void calculate(int balance){
         System.out.println("with AX interest amount is " + balance*0.01);
     }
 }

    }

