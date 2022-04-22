package Collection;

import java.util.ArrayList;

public class SumIntegerFromArrayList {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();
		A1.add(10);
		A1.add(20);
		A1.add("jhk");
		A1.add(12.870);
		A1.add(30);
		System.out.println(A1);
		int sum=0;
		for(Object i:A1)
		{
			try
			{
				sum=sum+Integer.parseInt(i.toString());
			}
			catch(Exception e)
			{
			//System.out.println(e);	
			}
			
		}
		System.out.println(sum);	

	}

}
