package Object;

public class BankAccount {
    String name;
    String username;
    String accountname;
    String password;
    String accountType;
    double balance;
    double transferLimit;
    int different;
    void login(String confirmPassword){
       if(password.equals(confirmPassword)){
           System.out.println("you may spend your money");
       }else{
           System.out.println("wrong password");

        }

    }
void transfer (int sendmoney){
        if (sendmoney<balance){
            double different=balance-sendmoney;
            System.out.println("transfer succesful. your remeining balance is " + different);
        }else{
            System.out.println("you don't have enough balance");
        }
}

    public static void main(String[] args) {

    }
void savings (){
        if(accountType.equals(accountname)){
            System.out.println("this is " + accountname);
        }else{
            System.out.println("Invalid");
        }
}
}
