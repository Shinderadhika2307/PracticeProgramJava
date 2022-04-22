//reverse() method is available in collections class
//reverse() is static method
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_reverse {

	public static void main(String[] args) {
		ArrayList<Integer> A1=new ArrayList();
		A1.add(12);
		A1.add(10);
		A1.add(77);
		Iterator i=A1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		Collections.reverse(A1);
		System.out.println("Reverse Arraylist is");
		Iterator j=A1.iterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
		
	}

}
//Arraylist should be comariable/generic
//For descending Arraylist we requre to first sort then reverse arraylist