package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double balance = 0;
		for(Employee employee: list){
			balance += employee.computeUpdatedBalanceSum();
		}
		return balance;
	}
}
