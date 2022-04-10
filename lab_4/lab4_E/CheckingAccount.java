package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_E;

public class CheckingAccount extends Account{
    private double monthlyFee;
    public CheckingAccount(String id, double fee, double balance){
        this.setAccId(id);
        this.setBalance(balance);
        this.monthlyFee = fee;
    }

    @Override
    public double computeUpdatedBalanceSum() {
        return this.getBalance() - monthlyFee;
    }
}
