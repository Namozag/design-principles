package dp.lsp.after;

/**
 *
 * @author hany
 */
public class Main {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		checkRect(rect);

		Square square = new Square();
//		checkRect(square);
	}

	private static void checkRect(Rectangle rect) {

		rect.setHeight(4);
		rect.setWidth(6);
		System.out.println("" + rect.getArea());
		assert rect.getArea() == 24;
	}

}
