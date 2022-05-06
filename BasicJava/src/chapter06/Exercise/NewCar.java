package chapter06.Exercise;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED =killoToMile(200);

	public NewCar() {

	}

	public NewCar(String color) {
		this.color = color;

	}

	public double getSpeed() {
		return mileTokillo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double getMaxSpeed() {
		return mileTokillo(MAX_SPEED);

	}
	public boolean speedUp(double speed) {
		speed =killoToMile(speed);
		if (this.speed+speed >= 0 && this.speed+speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
			
		} 
	       return false;	
	}
	public static double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	public static double mileTokillo(double distance) {
		return distance * 1.6;
	}

}