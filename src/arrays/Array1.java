package arrays;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		char ch[]= {'1','y','H'}; //a is array reference variable
		System.out.println(ch); //address or reference of array object
		System.out.println("length or size of array is: "+ch.length);  //size of array
		
		System.out.println(Arrays.toString(ch));
		
		//replacing element in array
		ch[2]='@';
		
		System.out.println(Arrays.toString(ch));

	}

}
//array size get fixed during declaration and initialization, we cannot add or remove
//array is also called as array object
//array reference variable used to store address of array object