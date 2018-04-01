package dp.lsp.after;

/**
 *
 * @author hany
 */
public class Square implements Shape {

	private int length;

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int getArea() {
		return length * length;
	}

}
