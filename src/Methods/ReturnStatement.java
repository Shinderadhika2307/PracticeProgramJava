package Methods;

public class ReturnStatement {

	public static void main(String[] args) {
		add(1,2);   //not using,not storing
		System.out.println(add(2,3));  //using & storing
		int sum=add(5,5); //storing
		System.out.println(sum);  //using
		

	}
	public static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}

}
