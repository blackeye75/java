package inheritanceAndConstructor.Vehicle;

public class VehicleUse {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
//		v.color = "Black";
//		v.setMaxSpeed(10);
//		v.print();
		
		Car c = new Car(10, 20);
		c.numGears = 10;
		c.color = "Black";
		c.setMaxSpeed(100);
//		c.print();
	}
}