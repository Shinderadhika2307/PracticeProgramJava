package logicalprogramming;

public class ArmstrongusingFor {

	public static void main(String[] args) {
		for(int a=1;a<=9;a++)  // find Armstrong between 100 to 999
		{
			for(int b=0;b<=9;b++)
			{
			for(int c=0; c<=9;c++)
			{
				int k=a*100+b*10+c*1;
				
				int arm=a*a*a+b*b*b+c*c*c;
				
				if(arm==k)
				{
					System.out.println(k+" is armstrong number");
				}
			}	
			}
			
		}
	
		

	}

}
