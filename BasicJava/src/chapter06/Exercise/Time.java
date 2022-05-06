package chapter06.Exercise;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {

	}

	public Time(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}

	public void sethour(int hour) {
		if (hour > 0 && hour < 24) {
			this.hour = hour;
		}
	}

	public void setminute(int minute) {
		if (minute > 0 && minute < 60) {
			this.minute = minute;			
		}
	}

	public void setsecond(int second) {
		if (second > 0 && second < 60) {
			this.second = second;			
		}
	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);

	}

}
