package Collection;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> A1=new ArrayList();
		A1.add(12);
		A1.add(10);
		A1.add(77);
		System.out.println(A1);
		
		Object[] a=A1.toArray();//IMP
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
//we can convert ArrayList to Array using toArray() method