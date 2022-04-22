package jump_statement;

public class Continue {

	public static void main(String[] args) {
		int a=1;
		while(a<=20)
		{
			
			if(a==14 || a== 17 || a==19)
			{
				a++;
				System.out.println("...skipping...");
				continue;
				
			}
			System.out.println(a);
			a++;
			
		}
		System.out.println("************************8");
		int b=1;
		while(b<=20)
		{
			if(b>=15 && b<=20)
			{
				b++;
				continue;
			}
			System.out.println(b);
			b++;
		}

	}

}


//break should be last statement of block
//if we put any statement after break compiler throws unreachable statement error