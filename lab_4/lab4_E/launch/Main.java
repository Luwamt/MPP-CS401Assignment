package mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_E.launch;

import java.util.ArrayList;
import java.util.List;


import mpp_cs401_assignments.MPP_CS401Assignment.lab_4.lab4_E.*;

/** This class tests the code package */
public class Main {
    // Uncomment when you are ready to test your code
	public static void main(String[] args) {
		Account[] checkingAccounts = new CheckingAccount[2];
		checkingAccounts[0] = new CheckingAccount("236-896", 25.00, 100);
		checkingAccounts[1] = new CheckingAccount("896-235", 25.00, 200);
		Account[] savingsAccounts = new SavingsAccount[3];
		savingsAccounts[0] = new SavingsAccount("985623", 0.01, 600);
		savingsAccounts[1] = new SavingsAccount("986523", 0.05, 500);
		savingsAccounts[2] = new SavingsAccount("896532", 0.03, 100);
		
		
		Employee e1 = new Employee("Luwam");
		Employee e2 = new Employee("Arkan");
		Employee e3 = new Employee("Merry");
		
			e1.addAccount(checkingAccounts[0]);
			e1.addAccount(savingsAccounts[0]);
			e2.addAccount(checkingAccounts[1]);
			e2.addAccount(savingsAccounts[1]);
			e3.addAccount(savingsAccounts[2]);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		System.out.println("The sum of updatedBalance is: "+Admin.computeUpdatedBalanceSum(employees));
		
		
	}

}
