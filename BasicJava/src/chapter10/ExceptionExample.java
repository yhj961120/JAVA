package chapter10;

public class ExceptionExample {
public static void main(String[] args) {
	//1.일반예외(compiletime Exception)
	
	try {
		Class.forName("java.lang.String");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//2.실행예외(Runtime Exception)
//	int[] numbers = new int[5];
//	numbers[10] =100;
}
}
