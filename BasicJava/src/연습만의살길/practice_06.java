package 연습만의살길;

public class practice_06 {
double Radius;
double X;
double Y;
double Area = Math.PI;

public double getRadius() {
	return Radius;
}
public void setRadius(double radius) {
	if(Radius<0)
		Radius = 0;
	this.Radius=Radius;
}
public double getX() {
	return X;
}
public void setX(double x) {
	this.X = x;
}
public double getY() {
	return Y;
}
public void setY(double y) {
	this.Y = y;
}


public double getArea() {
	 return Math.PI*(Radius*Radius);
	 
}



}
