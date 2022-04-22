package jump_statement;

public class Return1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return1 obj=new Return1();
		obj.add(10, 20);
				

	}
	public void add(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("Addition is:"+(a+b));
		return;
	}

}
 //we can have return statement with void returntype. but it will not return anything
