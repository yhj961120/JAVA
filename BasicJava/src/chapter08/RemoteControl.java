package chapter08;

public interface RemoteControl {

	public int MAX_VOLUME =10;
	public int MIN_NOLUME=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
