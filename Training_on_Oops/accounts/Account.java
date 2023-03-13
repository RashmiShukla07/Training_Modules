package accounts;

public class Account {
    private String accountNo;
    private String phoneNo;
    private float balance;
    private String name, address;
    private String dob;

    public Account(String accountNo, String name, String address, String phoneNo, String dob, float balance){
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.accountNo = accountNo;
        this.dob = dob;
        this.balance = balance;
    }
    
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address= a;
    }
    public void setDob(String d){
        dob = d;
    }
    public void setAccountNo(String acc){
        accountNo = acc;
    }
    public void setPhonenNo(String phn){
        phoneNo = phn;
    }
    public void setBalance(float b){
        balance = b;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getDob(){
        return dob;
    }
    public String getAccountNo(){
        return accountNo;
    }
    public String getPhonenNo(){
        return phoneNo;
    }
    public float getBalance(){
        return balance;
    }

    public void closeAccount(){
        System.out.println("The account of "+name+", accountNumber= "+accountNo+" is closed");
    }
}
