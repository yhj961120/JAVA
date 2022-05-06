package 연습만의살길;

public class Car {

	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	public Car() {

	}

	public Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String Color) {
		this.color = Color;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
		
	}

	public boolean speedUp(double distance) {
		if (speed + this.speed >= 0 && speed + this.speed <= MAX_SPEED) {
			this.speed = speed + this.speed;
			return true;	
	}
		    return false;
	}

	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
}
