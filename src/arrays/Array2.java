package arrays;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
	int a[]=new int[5]; //declare
	a[0]=11;     //storing values to array
	a[2]=23;
	a[4]=90;
	System.out.println(Arrays.toString(a));
	
	System.out.println("********************");
	char ch[]=new char[5];
	ch[0]='#';
	ch[1]='7';
     //	ch[5]='t'; ArrayIndexOutOfBoundsException
	System.out.println(Arrays.toString(ch));
	
	System.out.println("********************");
	boolean b[]=new boolean[2];
	b[1]=true;
	System.out.println(Arrays.toString(b));
	
	

	}
	

}


//here a[1] and a[3] will take default value as 0.
//ch[2],ch[3],ch[4] will take default value as space
//we can not access array without initialization, only int a[]; is not possible