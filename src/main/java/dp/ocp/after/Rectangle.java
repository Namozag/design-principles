package dp.ocp.after;

/**
 *
 * @author hany
 */
public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void draw() {
		System.out.println("I'm a rectangle whose width = " + width + " And height = " + height);
	}

}
