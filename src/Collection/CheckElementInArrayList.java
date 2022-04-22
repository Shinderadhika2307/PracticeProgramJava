package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckElementInArrayList {

	public static void main(String[] args) {
		ArrayList <String>A1=new ArrayList();
		A1.add("Vodaphone");
		A1.add("Jio");
		A1.add("Airtel");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter element to check:");
		String s=sc.next();
		if(A1.contains(s))
		{
			System.out.println(s+ " is available in arraylist");
		}
		else
		{
			System.out.println(s+ " is not available in arraylist");
		}

	}

}
