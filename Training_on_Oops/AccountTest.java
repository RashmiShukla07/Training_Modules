import accounts.*;

class AccountTest{
    public static void main(String[] args){
        SavingsAccount s = new SavingsAccount("100A", "Rashmi", "123 Street", "9098767891", "07/11/01", 50000);
        LoanAccount l = new LoanAccount("200B", "Amrita", "34 Town", "8079568791", "08./03/97", 20000, 300000, 100);

        s.withdraw(500);
        s.fixedDeposit(20000, 2);

        l.payEMI();
        l.repayment(30000);
        l.topUpLoan(100000);
        
    }
}