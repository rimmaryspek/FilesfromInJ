package Object;

public class BAccount {
    public static void main(String[] args) {
        BankAccount rimma  = new BankAccount();
        rimma.password="onetwo";
        rimma.balance=200.00;
        rimma.accountType ="saving";

        rimma.login("onetwo");
        rimma.savings();
        rimma.transfer(100);
    }
}
