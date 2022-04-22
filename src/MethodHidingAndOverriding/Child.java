package MethodHidingAndOverriding;

public class Child extends Parent {
	public static void food()  //method hiding
	{
		System.out.println("From food() of child");
	}
	public void coldDrink()   //method overriding
	{
		System.out.println("From coldDrink() of child");
	}

}
