//Global nonstatic variable
package variables;

public class GlobalNonstatic1 {
	int a=10;
	public static void main(String[] args)
	{
		GlobalNonstatic1 Obj=new GlobalNonstatic1();
		System.out.println(Obj.a);//10
		int a=20;
		System.out.println(a);//20
		

	}

}
