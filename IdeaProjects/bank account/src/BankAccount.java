public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void Deposit(double amount){
        System.out.println("You deposited: "+ amount + "and your account has" + (balance+amount));

    }

    public double Withdraw (double amount){
        if (amount > balance){
            System.out.println("The withdraw cannot be completed");
            return 0;
        }else{
            System.out.println("You withdraw: " + amount +"and your account now has"+ (balance-amount));
            return balance-amount;

        }
    }
}






