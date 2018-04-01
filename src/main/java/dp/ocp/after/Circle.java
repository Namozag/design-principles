package dp.ocp.after;

/**
 *
 * @author hany
 */
public class Circle extends Shape {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void draw() {
		System.out.println("I'm a circle whose radius = " + radius);
	}

}
