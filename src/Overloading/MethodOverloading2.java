package Overloading;

public class MethodOverloading2  {
	public int add(int a,int b)
	{
		return(a+b);
	}
	public  int add(int a,int b,int c)
	{
		return(a+b+c);
	}
	public  void add()
	{
		return;
	}
	public  int add(int a,int b,int c,int d)
	{
		
	return d;	
	}

	public static void main(String[] args) {
		MethodOverloading2 obj=new MethodOverloading2();
		System.out.println(obj.add(23,65));
	System.out.println(obj.add(45,34,87));	
		System.out.println(obj.add(56,87,21,89));

	}

}
