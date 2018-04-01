package dp.srp.after;

/**
 *
 * @author hany
 */
public class Main {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		PaySlipPrinter printer = new PaySlipPrinter();

		Employee employee = dao.getEmployee(1);
		printer.printPaySlip(employee);
	}
}
