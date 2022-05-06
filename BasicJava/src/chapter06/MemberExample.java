package chapter06;

public class MemberExample {
public static void main(String[] args) {
		
	
	Member mem1 = new Member();
	mem1.name = "양형주";
    mem1.age= 5000;
  
    Member mem2 = new Member();
	mem2.name ="양양형주";
    mem2.age=4000;
	
    System.out.println(mem1.name+mem1.age);
    System.out.println(mem2.name+mem2.age);
}
}
