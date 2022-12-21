import java.io.File;
import java.util.Scanner;

public class SavingsAccount extends Accounts {
    private int accountNo;
    private int balance;

    public SavingsAccount(int accountNo, int balance){
        super(accountNo, balance);
        super.createTransaction();
    }

    // getters & setters
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // methods
    public void transactions(){
        try {
            File file = new File(Integer.toString(this.accountNo));
            Scanner in = new Scanner(file);

            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
