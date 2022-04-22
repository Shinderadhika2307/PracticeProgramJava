package Collection;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<String, Integer>hm=new Hashtable();
		hm.put("Hello", 11);
		hm.put("hi", 10);
		hm.put("Hey", 11);
		hm.put("Ok",6);
		//hm.add(null,null); not allowed
		System.out.println(hm);
		for(String i:hm.keySet())
		{
			System.out.println("Key is:" +i+" & value is " +hm.get(i));
		}
	}

}
//Both HashTable and HashMap are hashing techniques that store unique keys, belongs to map interface
//HashMap allows multiple null values with one null key.
//HashTable doesnt allow null keys & null value
//The HashMap works very fast compared to the HashTable. It is because of the absence of any synchronization in it.
//The HashTable works very slow as compared to the HashMap. It is because of the presence of synchronization.
//Hashtable no HashTable
//Order of insersion is random
