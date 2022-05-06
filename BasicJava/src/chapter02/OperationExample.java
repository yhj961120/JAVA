package chapter02;

public class OperationExample {
public static void main(String[] args) {
	long var1 =2l;
	float var2 = 1.8f;
	double var3 = 2.5;
	String var4 = "3.9";
	int result8 = (int)(var1+var2+var3+(int)Double.parseDouble(var4));
	System.out.println(result8);

}
}
