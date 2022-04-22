package RuntimePolymorphism;

public class Dog extends Animal{
	public void talk()
	{
		System.out.println("Dog Says..");
		bark();
	}
	public void bark()
	{
		System.out.println("bow bow..");
	}

}
