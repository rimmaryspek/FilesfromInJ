package class30EXCEPTION;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            Dosomthing();
        }catch (NullPointerException ah){
            System.out.println("Got the null exception");
        }
            catch (IndexOutOfBoundsException e){
                System.out.println("Got the index of bound");
            }
        catch (NegativeArraySizeException d){
            System.out.println("we cant creat arrays with negative size");
        }
        catch (ArithmeticException a){
            System.out.println("This operations is not supported in Math");
        }

        catch (Exception e){
            System.out.println("I can handle any type of exception(error)");
        }

    }
    public  static void Dosomthing(){
        String name = null;// FIRTS ISSUE
        System.out.println(name.length());

      //  int arr[]= new int[1];//SECOND ISSUE
        //System.out.println(arr[10]);
        //String str = "gagagag";// THIRD ISSUE
       // str.charAt(20);
       // System.out.println(101/0);//FORTH ISSUE

    }
}
