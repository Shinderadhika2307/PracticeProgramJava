package Collection;

import java.util.HashMap;

public class HashMap3 {

	public static void main(String[] args) {
		HashMap<String, Integer>hm=new HashMap();
		hm.put("Hello", 11);
		hm.put("hi", 10);
		hm.put("Hey", 12);
		hm.put("Ok",6);
		System.out.println(hm); //Store randomely using keys
		for(String i:hm.keySet())
		{
			System.out.println("Key="+i+" & " +"values="+hm.get(i));
		}
		

	}

}
