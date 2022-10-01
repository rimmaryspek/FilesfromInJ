package class15;

import Class14.Taks5;

public class task5 {
    //Create a method createEmail(). Based on values of users name,
    // lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail(String firstname, String lastname,String emailType) {
return (firstname+lastname+"@" +emailType+".com").toLowerCase();

    }

    public static void main(String[] args) {
        Taks5 taks5=new Taks5();
        //String fullemail=taks5.createEmail()';
       // System.out.println(fullemail);

    }



}
