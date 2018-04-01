package dp.srp.after;

/**
 *
 * @author hany
 */
public class PaySlipPrinter {

	public void printPaySlip(Employee employee) {
		System.out.println("Payslip");
		System.out.println("Name: " + employee.getName());
		System.out.println("Total: " + employee.getSalary());
	}
}
