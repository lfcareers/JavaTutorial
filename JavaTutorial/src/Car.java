
public class Car {
	private String make;
	int speed;
	int gear;
	
	public Car() {
		this(10, 2);
		this.speed = 0;
		this.gear = 0;
		System.out.println("executing constructor without arguments");
		
	}
	
	public Car(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}
	
	//"this" refers to the instance of the class (object)
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}

}
