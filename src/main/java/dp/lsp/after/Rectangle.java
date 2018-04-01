package dp.lsp.after;

/**
 *
 * @author hany
 */
public class Rectangle implements Shape {

	protected int width;
	protected int height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

}
