public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Hello", "7th street, bashundhara, Dhaka, Bangladesh");
        CurrentAccount ca = new CurrentAccount(customer.accountNo, 10000);

        ca.withdraw(5000);
        ca.deposite(5000);
        ca.transactions();
    }
}
