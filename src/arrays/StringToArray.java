package arrays;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
		String s= "Velocity is at katraj";
		System.out.println("Given sentence is " +s);
		String[] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));

	}

}
