package Collection;

import java.util.HashSet;
import java.util.Iterator;

import Constructor.E;

public class HashSet1 {

	public static void main(String[] args) {

HashSet h1=new HashSet();
h1.add("pineapple");
h1.add(50);
h1.add('@');
h1.add("Rose");
h1.add(50);//duplicate value not allowed, it save only once
System.out.println(h1); //Store randomlly
System.out.println("Size is:"+h1.size());
Iterator i=h1.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
	}

}
//Set-->set is interface,belongs to java.util package
//we cannot create object of set, but we can create reference of type set
//Hashset-->Concrete subclass of set interface
//cannot store duplicates
//does not maintain insertion order
//store object in random manner
//store homogeneous and heterogeneous values
//only one null
//Accourding to formula key will generated, and address for data will fixed
