package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string which you want to reverse: ");
		String s=sc.nextLine();
		String Arr[]=s.split(" ");
		System.out.println(Arrays.toString(Arr));
		for(int i=0;i<Arr.length/2;i++)
		{
			String temp=Arr[(Arr.length-1)-i];
			Arr[(Arr.length-1)-i]=Arr[i];
			Arr[i]=temp;
			
			
		}
		System.out.println("reverse String is: "+Arrays.toString(Arr));

	}

}
