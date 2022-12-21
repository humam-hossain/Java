import java.io.File;
import java.util.Scanner;

public class CurrentAccount extends Accounts {
    private int accountNo;
    private int balance;

    public CurrentAccount(int accountNo, int balance){
        super(accountNo, balance);
        super.createTransaction();
    }

    // getters & setters
    public int getAccountNo() {
        return super.getCustomer_id();
    }

    public void setAccountNo(int accountNo) {
        super.setCustomer_id(accountNo);
    }

    public int getBalance() {
        return super.getBalance();
    }

    public void setBalance(int balance) {
        super.setBalance(balance);
    }

    // methods
    public void transactions(){
        try {
            File file = new File(Integer.toString(this.getAccountNo()));
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
