package chapter07;

public class supersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int FlyMode=NORMAL;

	@Override
	public void fly() {
		if (FlyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}

	}

}
