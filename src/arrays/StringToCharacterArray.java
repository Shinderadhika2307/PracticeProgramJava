package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharacterArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string which you want to reverse: ");
		String s=sc.nextLine();
		char Arr[]=s.toCharArray(); //converts string to character
		System.out.println(Arrays.toString(Arr));
		

	}

}
