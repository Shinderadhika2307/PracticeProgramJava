package operators;

public class Logical3 {

	public static void main(String[] args) {
		int a=100, b=200;
		
		if(a==100 && b==200)
		{
			System.out.println("Using AND");
		}
		if(a<=b || b>200)
		{
			System.out.println("Using OR");
		}
		if(!(b<=a))
		{
System.out.println("Using NOT");
	}

}
}