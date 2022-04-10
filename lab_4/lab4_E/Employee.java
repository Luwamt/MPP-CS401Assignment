package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_E;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> employeeAccounts;

	public Employee(String name){
		this.name = name;
		employeeAccounts = new ArrayList<>();
	}

	public List<Account> getEmployeeAccounts() {
		return employeeAccounts;
	}

	public void addAccount(Account employeeAccount) {
		this.employeeAccounts.add(employeeAccount);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double balance = 0.0;
		for(Account account : this.employeeAccounts){
			balance += account.computeUpdatedBalanceSum();
		}
		return balance;
	}
}
