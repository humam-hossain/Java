import java.io.File;
import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    int accountNo;

    public Customer(int accountNo, String name, String address){
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
    }

    // getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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

    public void updateDetails(String name, String address){
        this.name = name;
        this.address = address;
    }
}