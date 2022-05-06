package 연습만의살길;

public class Plane {
private String manufacture;
private String model;
private int maxNumberOfPassengers;
private int numberOfPlanes;

public Plane() {
	numberOfPlanes ++;
}
public Plane(String manufacture, String model, int maxNumberOfPassengers) {
	this.manufacture=manufacture;
	this.model=model;
	this.maxNumberOfPassengers=maxNumberOfPassengers;
	numberOfPlanes++;

}
public String getmanufacture() {
	return manufacture;
}
public void setmanufacture(String manufacture) {
	this.manufacture=manufacture;
}
public String getModel() {
	return model;
}
public void setmodel(String model) {
	this.model=model;
}
public int getMaxNumberOfPassengers() {
	return maxNumberOfPassengers;
	
}
public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
	
	if(maxNumberOfPassengers<0) {
		maxNumberOfPassengers=0;
	}
	this.maxNumberOfPassengers=maxNumberOfPassengers;	
}
public int getNumberOfPlanes() {
	return numberOfPlanes;
}

public String toString() {
	return "Plane [manufacture=" + manufacture + ", model=" + model + ", maxNumberOfPassengers=" + maxNumberOfPassengers
			+ ", numberOfPlanes=" + numberOfPlanes + "]";
}



}