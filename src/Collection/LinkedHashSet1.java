
package Collection;
import java.util.*;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add("aaa");
		lhs.add('y');
		lhs.add(null);
		
		System.out.println(lhs); //lenear storage

	}

}
//doesnt store duplicates
//only one null value
//insersion order is sequential