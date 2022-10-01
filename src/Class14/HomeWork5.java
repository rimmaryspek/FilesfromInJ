package Class14;

public class HomeWork5 {
    //Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete
    // email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
    //Write a method to return whether given number is prime or not?

void createEmail(String firstName, String lastname){
    System.out.println(firstName+lastname +"@gmail.com");
}
 public static void main(String[] args) {
        HomeWork5 email=new HomeWork5();
        email.createEmail("rimma","teltaeva");
    }

}
