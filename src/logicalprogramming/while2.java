	
//w.a.p to print addition of first 4 numbers starting from 1
package logicalprogramming;

public class while2 {

	public static void main(String[] args) {
		int a=1;
		int sum=0;
		while(a<=4)
		{
			sum=a+sum;
			a++;
		}

		System.out.println(sum);
	}

}
