package dp.dip.after;

/**
 *
 * @author hany
 */
public class Main {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.setVehicle(new Car());
		driver.drive();

		driver.setVehicle(new SchoolBus());
		driver.drive();
	}
	
}
