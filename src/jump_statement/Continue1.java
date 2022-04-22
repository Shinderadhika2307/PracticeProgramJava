package jump_statement;

public class Continue1 {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			if(i%2==1)
			{
				
				//System.out.println("Skipping odd..");
				continue;
			}
			System.out.println(i);
		}

	}

}
