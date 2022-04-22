package Collection;
import java.util.HashMap;
public class Hashmap2 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "pune");
		hm.put("name", 2);
		hm.put('$',"ggggg");
		System.out.println(hm);
		System.out.println("**************************");
		System.out.println("Size is: "+hm.size());
		
		System.out.println("**************************");
		for(Object i:hm.keySet())
		{
			System.out.println(i);//returns only keys
		}
		System.out.println("**************************");
		for(Object i:hm.values()) //returns only values
		{
			System.out.println(i);
		}
		System.out.println("**************************");
		for(Object i:hm.keySet())
		{
			System.out.println(i+" = "+hm.get(i));//get method used to access values
		}
		System.out.println("**************************");
		//in get() we can pass keys and access values of that key
		System.out.println(hm.get(1));
		System.out.println("**************************");
		System.out.println(hm.remove('$'));
		System.out.println(hm);
		System.out.println("**************************");
		hm.clear();
		System.out.println(hm);		
	}
}
//hashmap store values randomly
//The keySet() method returns a set of unique keys, and we pass the keys to the get method to retrieve each value.
//put(),get(), remove(),clear(),size()