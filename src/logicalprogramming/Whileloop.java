
//WAP to print even numbers between range 25 to 50
package logicalprogramming;

public class Whileloop {

	public static void main(String[] args) {
		int a=25;
		while(a<=50)
		{
			if(a%2==0)
			{
				System.out.println(a+" is even number");
			}
			a++;
		}

	}

}
