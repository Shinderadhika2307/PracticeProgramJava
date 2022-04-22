package Methods;

public class MethodWithVariableArgument1 {

	public static void main(String[] args) {
		MethodWithVariableArgument1 obj=new MethodWithVariableArgument1();
	int multiplication=obj.mult(1,2,3,4,5,6,7,8);
	System.out.println("Multiplication is:" +multiplication);
	int multi=obj.mult();
	System.out.println(multi);

	}
	public int mult(int ...a)
	{
	int	mult=1;
		for(int i=0;i<a.length;i++)
		{
			mult=mult*a[i];
		}
		return mult;
	}

}
//we can call method with variable arguments by passing nothing
//the java compiler always search for method with matching arguments,
//If such method is not found then method with variable argument is executed.
