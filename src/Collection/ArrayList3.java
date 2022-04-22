
//How to print elements of array without using get method
//1.Using for each loop
//2.Using Iterator //hasNext()//Next()
package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		
		System.out.println("===Using for each loop for generic Arraylis==");
		ArrayList<Integer> A1=new ArrayList ();
		A1.add(20);
		A1.add(30);
		A1.add(40);
		for(Integer i:A1)
		{
			System.out.println(i);
		}
		
		System.out.println("===Using for each loop for object/nongeneric Arraylis==");
		ArrayList A2=new ArrayList();
		A2.add(10);
		A2.add("Hi");
		A2.add('a');
		A2.add(12.870);
		
		A2.forEach((e) ->
	{
		System.out.println(e);	
		});
		
		System.out.println("======Using Iterator=====");
		System.out.println("======Using Iterator for generic arraylist=====");
		ArrayList<Integer>A3=new ArrayList();
		A3.add(10);
		A3.add(56);
		A3.add(90);
		Iterator i=A3.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("======Using Iterator for nongeneric arraylist=====");
		ArrayList A4=new ArrayList();
		A4.add(10);
		A4.add('y');
		A4.add("uuu");
		Iterator j=A4.iterator();
		while(j.hasNext())
		{
		System.out.println(j.next());
		}
		

	}

}
//Steps to create iterator
//create iterator object using iterator method
//Iterator method returns refference of type Iteraor, store that refference in a variable of type iterator
//Access elements of iterator using hasNext and Next method