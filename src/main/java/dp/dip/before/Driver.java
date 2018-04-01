package dp.dip.before;

/**
 *
 * @author hany
 */
public class Driver {

	private Car car;

	public void setCar(Car car) {
		this.car = car;
	}

	public void drive() {
		car.move();
	}

}
