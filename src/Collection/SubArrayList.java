package Collection;

import java.util.ArrayList;
import java.util.List;

public class SubArrayList {
public static void main(String args[])
{
	ArrayList<Integer> A1=new ArrayList();
	A1.add(10);
	A1.add(78);
	A1.add(50);
	A1.add(12);
	
	List <Integer> A2=A1.subList(0, 2);
	System.out.println(A2);
	
}
}
