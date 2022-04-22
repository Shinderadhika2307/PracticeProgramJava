package Collection;

import java.util.ArrayList;

public class ArrayList_addAll {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();
		A1.add(10);
		A1.add(78);
		A1.add("jhk");
		A1.add(12.870);
		
		ArrayList A2=new ArrayList();
		A2.add(10);
		A2.add("Hi");
		A2.add('a');
		A2.add(12.870);
	
		A1.addAll(A2);
		System.out.println(A1); //[10, 78, jhk, 12.87, 10, Hi, a, 12.87]
		System.out.println(A2); //[10, Hi, a, 12.87]


	}

}
