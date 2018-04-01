package dp.isp.before;

/**
 *
 * @author hany
 */
public class MultifunctionPrinter implements MultiFunctionPrinterInt {

	@Override
	public void print(String source) {
		System.out.println("Print [ " + source + " ]");
	}

	@Override
	public String copy(String source) {
		System.out.println("Copy [ " + source + " ]");
		return source;
	}

	@Override
	public String scan(String source) {
		System.out.println("Scan [ " + source + " ]");
		return source;
	}

	@Override
	public void sendFax(String source, String number) {
		System.out.println("Send [ " + source + " ] to [ " + number + " ]");
	}

}
