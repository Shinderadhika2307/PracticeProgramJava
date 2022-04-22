package Overloading;

public class MethodOverloading {
	
public static int add(int a,int b)
{
	return(a+b);
}
public static int add(int a,int b,int c)
{
	return(a+b+c);
}
public static void add()
{
	return;
}

	public static void main(String[] args) {
		
	int c=	add(10,20);
	int e= add(45,78);
	int d=add(23,65,90);
	System.out.println(c);
	System.out.println(e);
	System.out.println(d);
	}

}
