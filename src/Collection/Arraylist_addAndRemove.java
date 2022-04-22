package Collection;

import java.util.ArrayList;

public class Arraylist_addAndRemove {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();
		A1.add(10);
		A1.add("Hi");
		A1.add('a');
		A1.add(12.870);
		System.out.println(A1);
		A1.remove(0); //while removing integer values always taken as index
		System.out.println(A1);
		A1.remove("Hi"); //we can delete dada
		System.out.println(A1);
		

	}

}
//add()