package dp.srp.before;

/**
 *
 * @author hany
 */
public class EmployeeManager {

	public Employee getEmployee(int id) {
		// do some DB operations
		return new Employee("Hafez Hamdy", 1500d);
	}

	public void printPaySlip(Employee employee) {
		System.out.println("Payslip");
		System.out.println("Name: " + employee.getName());
		System.out.println("Total: " + employee.getSalary());
	}

}
