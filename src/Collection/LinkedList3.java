package Collection;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args)
	{
		LinkedList <String> a=new LinkedList();
		a.add("Sonam");
		a.add("Priya");
		a.add("Monika");
		System.out.println(a);//[Sonam, Priya, Monika]
		a.remove("Priya");
		System.out.println(a);//[Sonam, Monika]
		a.remove(0);
		System.out.println(a);//[Monika]
		
		LinkedList <String> b=new LinkedList();
		b.add("Jyoti");
		b.add("Sita");
		b.add("Jyoti");
		System.out.println(b);//[Jyoti, Sita, Jyoti]
		a.addAll(b);
		System.out.println(a);//[Monika, Jyoti, Sita, Jyoti]
		a.removeAll(b);
		System.out.println(a);//[Monika]
		
		b.removeFirst();//removes first element
		b.removeLast();//removes last element
		System.out.println(b);//[Sita]
		
		
		LinkedList <String> c=new LinkedList();
		c.add("gita");
		c.add("Maya");
		c.add("gita");
		c.add("Mayuri");
		c.add("Maya");
		System.out.println(c);
		c.removeFirstOccurrence("gita");//remove first occurrence
		System.out.println(c);
		c.removeLastOccurrence("Mayuri"); //remove last occurrence
		System.out.println(c);
		
		a.clear(); //Clear list
		System.out.println(a);
	}
}
//remove(),removeAll();removeFirst(),removeLast();removeFirstOccurrence(),removeLastOccurrence(),clear
