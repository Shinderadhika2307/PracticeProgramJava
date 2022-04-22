package Methods;

public class MethodWitVariableArgument {

	public static void main(String[] args) {
		test(235,678,900,879,45);

	}
	public static void test(int...a)
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	
	}

}
//Variable arguments works as array refference variablr
//Diff is array have fixed size, variable argument can be any size