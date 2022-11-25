public class Customer {
    private int id;
    private String name;
    private String address;
    private int phone;
    private int acctno;
    private double currentbalance;

    Customer(int id, String name, String address, int phone, int acctno, double currentbalance){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.acctno = acctno;
        this.currentbalance = currentbalance;
    }

    // getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public int getPhone(){
        return this.phone;
    }
    public int getAcctno(){
        return this.acctno;
    }
    public double getCurrentbalance(){
        return this.currentbalance;
    }

    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public void setAcctno(int acctno){
        this.acctno = acctno;
    }
    public void setCurrentbalance(double currentbalance){
        this.currentbalance = currentbalance;
    }

    // functional methods
    public void DepositMoney(double money) {
        this.currentbalance += money;
        System.out.println("Your current balance is " + this.currentbalance);
    }

    public void WithdrawMoney(double money) {
        this.currentbalance -= money;
        System.out.println("Your current balance is " + this.currentbalance);
    }

    public boolean ApplyForLoan(double money) {
        if (this.currentbalance >= 200000) {
            System.out.println("Applied for "+ money + "loan successfully!");
            return true;
        }
        
        System.out.println("You need to have balance 200000 to apply for loan");
        return false;
    }

    public boolean RequestCard() {
        if (this.currentbalance >= 200000) {
            System.out.println("Requested for card successfully!");
            return true;
        }

        System.out.println("You need to have balance 200000 to request for card");

        return false;
    }

    @Override
    public String toString() {
        return "\nid: " + this.id + "\nname: " + this.name + "\naddress: " + this.address + "\nphone: " + this.phone
                + "\nacctno: " + this.acctno + "\ncurrentbalance: " + this.currentbalance;
    }

    public static void main(String[] args) {
        Customer customer = new Customer(0, "Zaka", "3rd Street, Bashundhora, Dhaka", 88015656, 0, 10000);

        customer.getCurrentbalance();
        customer.DepositMoney(50000);
        customer.WithdrawMoney(1000);
        customer.ApplyForLoan(10000000);
        customer.RequestCard();

        System.out.println(customer.toString());
    }
}
