package chapter02;

public class LongOperationExample {
public static void main(String[] args) {
	byte value1 = 10;
	int value2 = 100;
	long value3 =1000L;
	long result = value1 + value2 + value3;
	System.out.println(result);
		
 

byte bytevalue1 = 10;
byte bytevalue2 = 20;
//byte bytevalue3 = batevalue1 + batevalue2;
int intvalue1 = bytevalue1 + bytevalue2;
System.out.println(intvalue1);

char charvalue1 = 'A';
char charvalue2 = 1;
//char charvalue3 = charvalue1 + charvalue2;
int intvalue2 =charvalue1 +charvalue2;
System.out.println("유니코드=" + intvalue2);
System.out.println("출력문자=" + (char)intvalue2);

int intvalue5 = 10;
// int intvalue = 10 / 4.0;
double doublevalue = intvalue5 / 4.0;
System.out.println(doublevalue);

int x = 1;
int y = 2;
double result7 = (double) x / y;
System.out.println(result7);

long var1 =2l;
float var2 = 1.8f;
double var3 = 2.5;
String var4 = "3.9";
int result8 = (int)(var1+var2+var3+(int)Double.parseDouble(var4));
System.out.println(result8);

}
}
