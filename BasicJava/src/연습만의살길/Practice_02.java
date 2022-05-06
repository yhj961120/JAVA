package 연습만의살길;

public class Practice_02 {
public static void main(String[] args) {
	
	int[]array= {38,16,76,3,94,82,74,59,8};
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	
	for (int i = 0; i < array.length; i++) {
		if(max<array[i]) {
		 max=array[i];
		}	 
		 if(min>array[i]) {
			 min=array[i];
		 }
		 }
	System.out.println("최대값:" + max);
	System.out.println("최소값:"+ min);
}
}
