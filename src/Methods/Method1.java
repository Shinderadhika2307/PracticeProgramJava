package Methods;

public class Method1 {

	public static void main(String[] args)  //calling Method
	{
	System.out.println("From Main");
	add(); //Method call statement

	}
public static void add()   //called Method
{
	int a=10,b=20;
	int c=a+b;
	System.out.println("Addition is:" +c);
}
}
