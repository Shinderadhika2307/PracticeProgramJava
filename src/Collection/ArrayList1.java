package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> A1=new ArrayList(); //generic arraylist is used to store homogenious values only
		A1.add(10);
		A1.add(20);//add()
		A1.add(30);
		A1.add(40);
		A1.add(50);
		A1.add(60);
		
		System.out.println(A1);//Print arraylist
		System.out.println(A1.size()); //length of array //size()
		A1.set(2, 90); //set()
		System.out.println(A1);
		A1.remove(5); //integer velues always taken as index
		
		System.out.println(A1);
		A1.add(20); //duplicate value
		System.out.println(A1);
		Collections.reverse(A1);
		System.out.println(A1);
		Collections.sort(A1);
		System.out.println(A1);
		System.out.println(A1.isEmpty());
		System.out.println(A1.get(1));
		}
}
//Arraylist can store homogenious as well as heterogenious object
//Arraylist can grow and shrink dynamically
//Arraylist can store duplicate values
//methods add(),remove(),set(),isEmpty();size();get();

//List                                                         Set
//allow duplicate value                                        Dont allow duplicate value
//any number of null value                                     only null value
//maintain insersion order                                     dont maintain any insersion order