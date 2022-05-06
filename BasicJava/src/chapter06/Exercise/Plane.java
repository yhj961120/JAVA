package chapter06.Exercise;

public class Plane {
private String manufacture;
private String model;
private int maxNumberOfPassengers;
 static int numberOfPlanes;

public Plane( ) {
	 this(null,null,0);
}
public Plane(String manufacture, String model, int maxNumberOfPassengers) {
	this.manufacture = manufacture;
	this.model = model;
	this.maxNumberOfPassengers = maxNumberOfPassengers;
	numberOfPlanes++;
}

public String getmanufacture() {
    return manufacture;
}

public void setmanufacture(String manufacture) {
    this.manufacture = manufacture;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getmaxNumberOfPassengers() {
    return maxNumberOfPassengers;
}

public void setmaxNumberOfPassengers(int maxNumberOfPassengers) {
   if(maxNumberOfPassengers>0) {
	   this.maxNumberOfPassengers=maxNumberOfPassengers;
	 
   }
}

public String toString(){
    return "manufacture : "+ manufacture+", Model : "+model+", maxNumberOfPassengers : "+maxNumberOfPassengers;
}

public static int getnumberOfPlanes() {
	return numberOfPlanes;
	}

}
