package accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNo, String name, String address, String phoneNo, String dob, float balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }

    public void withdraw(float amount) {
        float curBalance = getBalance();
        if (amount <= curBalance) {
            setBalance(curBalance - amount);
            System.out.println("An amount of "+ amount +" has been withdrawn from account "+getAccountNo()+" the current Balance is " + getBalance());
        } else {
            System.out.println("Insufficient Balance" );
        }
    }

    public void deposit(float amount) {
        float curBalance = getBalance();
        setBalance(curBalance + amount);
        System.out.println("Deposited an amount of " + amount + " in account "+getAccountNo());
    }

    public void fixedDeposit(float amount, int years) {
        System.out.println("Fixed deposit of " + amount + " for " + years+" years" );
    }
}
