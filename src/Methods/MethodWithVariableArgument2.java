package Methods;

public class MethodWithVariableArgument2 {

	public static void main(String[] args) {
		toPrint(10,"Radhika","Kisan","Shinde");

	}
	public static void toPrint(int a, String...b) //  (String...b,int a) not possible
	{
		System.out.println(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
//Variable argument Should be at end position in paranthesis