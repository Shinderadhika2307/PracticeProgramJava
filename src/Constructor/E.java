package Constructor;

public class E {
	int a;
	
	E()
	{
		System.out.println("From E()");
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		
System.out.println("From Main");
E obj= new E();
System.out.println(obj.a);
obj.a=100;
System.out.println(obj.a);



	}

}
