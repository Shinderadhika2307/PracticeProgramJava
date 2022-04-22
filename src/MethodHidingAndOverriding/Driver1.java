package MethodHidingAndOverriding;

public class Driver1 {

	public static void main(String[] args) {
		Parent p=new Parent();
		Parent q=new Child();
		//Or
			Child r=new Child();
			Parent s;
			s=r;
		System.out.println("****Method Hiding****");
		s.food();
		p.food();
		q.food();
	
		System.out.println("****Method Overriding****");
		p.coldDrink();
		q.coldDrink();
	}

}
