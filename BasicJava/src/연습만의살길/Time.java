package 연습만의살길;

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
   if(hour<0 || hour>23) {
	   this.hour=0;
	   return;
   }
	   this.hour=hour;
	      
}
public void setminute(int minute) {
	if(minute<0 ||minute>59) {
		this.minute=0;
		return;
	}
	this.minute=minute;
}
public void setsecond(int second) {
 if(second<0 || second>59) {
	 this.second=0;
	 return;
 }
	this.second=second;
}

public String toString() {
	return String.format("%02d:%02d:%02d",hour,minute,second);
}
}