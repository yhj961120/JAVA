package chapter05;

public class 연습문제0421 {
public static void main(String[] args) {
//	int max = 0 ;  //Integer.MIN_VALUE;
//	int[] array = {1,5,3,8,2};
//	int min = array[0]; //Integer.MAX_VALUE;
//	for (int i = 0; i < array.length; i++) {
//		if(max<array[i]) {
//		 max=array[i];
//		 }
//	    if(min>array[i]) {
//	    	min=array[i];
	    	
//	    }
//	}
	 
	
	
//	System.out.println("max : " +max);
//    System.out.println("min :" +min);

int[][] array= {
		{95,86},
	    {83,92,96},
	    {78,83,93,87,88}
	};

int sum = 0;
double avg = 0.0;
 int count =0;
 for (int i = 0; i < array.length; i++) {
	for (int j = 0; j < array[i].length; j++) {
		sum += array[i][j];
	 count++;
	
	}
}
avg = (double)sum/count;

System.out.println("sum :" + sum);
System.out.println("avg :" + avg);


}
}
