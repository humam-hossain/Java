import java.io.File;
import java.io.FileWriter;

public class Accounts {
    private int customer_id;
    private int balance;
    
    public Accounts(int customer_id, int balance){
        this.customer_id = customer_id;
        this.balance = balance;
    }

    // getters & setters
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // methods
    public void deposite(int amount){
        if(amount > 0){
            this.balance += amount;

            try {
                FileWriter fwriter = new FileWriter(Integer.toString(this.customer_id));
                fwriter.write("Deposited: " + amount + " Balance: " + this.balance + "\n");
                fwriter.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void withdraw(int amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;

            try {
                FileWriter fwriter = new FileWriter(Integer.toString(this.customer_id));
                fwriter.write("Withrawn: " + amount + " Balance: " + this.balance + "\n");
                fwriter.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void createTransaction(){
        try {
            File file = new File(Integer.toString(this.customer_id));
            file.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
