package RuntimePolymorphism;

public class Tiger extends Animal{

	public void talk()
	{
		System.out.println("Tiger Says..");
		roar();

	}
	public void roar()
	{
		System.out.println("Grrrrrrrrrr...");
	}

}
