//sort elements of ArrayList using sort()
//sort is static method of collections class
//It will give Arraylist in assending order
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist_Sort {

	public static void main(String[] args) {
		ArrayList<Integer>A1=new ArrayList();
		A1.add(10);
		A1.add(7);
		A1.add(15);
		A1.add(6);
		System.out.println("Befor Sorting");
		for(Integer i:A1)
		{
			System.out.println(i);
		}
		
		System.out.println("After Sorting");
		Collections.sort(A1); //imp method
		System.out.println("Print using for each");
		for(Integer i:A1)
		{
			System.out.println(i);
		}
		//or
		System.out.println("Print Using iterator");
		Iterator j=A1.iterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
		}

	}

}
