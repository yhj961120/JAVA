package chapter07;

public class SupersonicAirplaneExample {
public static void main(String[] args) {
	supersonicAirplane sa =new supersonicAirplane() ;
		sa.takeOff();
		sa.fly();
		sa.FlyMode =supersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.FlyMode=supersonicAirplane.NORMAL;
		sa.fly();
        sa.land();		
		
	
}
}
