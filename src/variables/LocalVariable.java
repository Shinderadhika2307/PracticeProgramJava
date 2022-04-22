package variables;

public class LocalVariable {
public static void m1()
{
	int a=20; //local to m1
	char ch='B'; //local to m1
	System.out.println(a);
	System.out.println(ch);
}
	public static void main(String[] args) 
	{
int a=10; //local to main
char ch='A'; //local to main
System.out.println(a);
System.out.println(ch);
m1();
System.out.println("Using GlobalVariable1 class variable: " +GlobalVariable1.Name); //Radhika
	}	

 static{
		System.out.println("Hello i am code block"); 
		int c=30; //Local
		System.out.println(c);
	}
	
	

}
