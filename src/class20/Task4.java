package class20;

public class Task4 {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.
    public static void main(String[] args) {
        userInfo info = new userInfo("rimma","9177707825","orlando");
        userInfo.printUserDetails();
    }
}
class userClass{
    static String name;
    static String mobileNumber;

userClass(String name, String mobileNumber){
    this.name=name;
    this.mobileNumber=mobileNumber;
}

}

class userInfo extends userClass {
    static String address;
 userInfo( String name, String mobileNumber, String address){
     super(name,mobileNumber);
     this.address=address;
}
 static void printUserDetails(){
    System.out.println("name" + name+ " Mobile Number " + mobileNumber+ " address" + address);
}
    public static void main(String[] args) {
        userInfo info = new userInfo("rimma","9177707825","orlando");
        userInfo.printUserDetails();
    }

}