package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_E;

public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(String id, double interestRate, double account){
        this.setAccId(id);
        this.setBalance(account);
        this.interestRate = interestRate;
    }
    @Override
    public double computeUpdatedBalanceSum() {
        return this.getBalance() + (this.interestRate * this.getBalance());
    }
}
