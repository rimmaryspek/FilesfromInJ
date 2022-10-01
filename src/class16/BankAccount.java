package class16;

public class BankAccount {
    // samples for all the access modifiers
    private String username;
    private String password;
    int accountNumber;
    public String bankName;

    public void printbankName(){
        System.out.println(bankName);
    }
   private void printUserName(){
        System.out.println(username);
    }
    void printAccountNumber(){  // default modifier
        System.out.println(accountNumber);
    }
}
