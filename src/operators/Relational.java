package operators;

public class Relational {

	public static void main(String[] args) {
		int age= 20, grade=9;
		boolean indian= true;
		
		
		if(age>=18 && indian==true)
		{
			
			System.out.println("You are eligible for passport");
					}
		if(age>18 && grade>=5 && indian != false)
		{
		System.out.println("You are also eligible for passport");
		}
		if(!(age<18 && grade<5 && indian==false))
		{
			System.out.println("Not Eligible for passport");
		}
		
	}

}
;