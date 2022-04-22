package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> A1=new ArrayList();//generic
		A1.add(10);
		A1.add(30);
		A1.add(60);
		System.out.println(A1);//Prints only View
		for(int i=0;i<A1.size();i++) //Print with for loop
		{
			System.out.println(A1.get(i));//get method to aquire element of specific index
		}
		System.out.println("=============================");
		
		int save=A1.get(1); //in generic returntype of get method is generic i.e int, char,floate
		System.out.println(save);
	}
}

//generic arraylist is used to store homogenious values only