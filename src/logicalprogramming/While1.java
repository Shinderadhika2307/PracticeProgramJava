
//WAP to print even numbers between 10 to 20 which are divisible by 3 and 5.
package logicalprogramming;

public class While1 {

	public static void main(String[] args) {
		int a=10;
		while(a<=20)
		{
			if(a%2==1 && a%3==0 && a%5==0)
			{
				System.out.println(a);
			}
			a++;
		}

	}

}
