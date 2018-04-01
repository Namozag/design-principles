package dp.isp.before;

/**
 *
 * @author hany
 */
public class Main {

	public static void main(String[] args) {
		MultiFunctionPrinterInt printer = new MultifunctionPrinter();

		printer.print("TEST PAGE");
		printer.sendFax("what is this", "what is this");
	}

}
