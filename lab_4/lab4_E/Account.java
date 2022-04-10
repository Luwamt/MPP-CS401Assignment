package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_E;

public abstract class Account {
    private String accId;
    private double balance;

    public String getAccId() {
        return accId;
    }

    protected void setAccId(String accId) {
        this.accId = accId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public abstract double computeUpdatedBalanceSum();
}
