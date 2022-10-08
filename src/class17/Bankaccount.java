package class17;

public class Bankaccount {
    private String userName;
    private String passWord;
    String accountType;
    double balance;
    double sendMoney;
    boolean isCredit;

    public Bankaccount(String custumername, String custPassword) {
        userName = custumername;
        passWord = custPassword;
    }

    public String login(String confirmedPass) {
        String result = null;
        if (!userName.isEmpty()) {
            if (passWord.equals(confirmedPass)) {
                result = "you have sucssefully login";
            } else {
                result = "Your password doent match";
            }
        }
        return result;
    }

    public void Transfermoney(String nextaccountType) {
        double remain;
        if (!accountType.equalsIgnoreCase(nextaccountType)) {
         //   if ( Transfermoney< balance) {
          //      remain = balance - Transfermoney;
          //      System.out.println("You have successfully transferred $" + Transfermoney
           //             + ". Your remaining balance $" + remain);

            } else {
                System.out.println("You do not have enough balance.");
            }
     //   } else {
            System.out.println("You cannot send money to Same Account Type");
        }
   // }

    public static void main(String[] args) {
        Bankaccount bankaccount = new Bankaccount("syntax", "pass123");
        String str= bankaccount.login("pass123");
        System.out.println(str);
    }
}
