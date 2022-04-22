package Exception;

public class VelocityExceptionHandling {

	public static void main(String[] args) {
		try
		{
			throw new VelocityException();
		}
		catch(VelocityException e)
		{
			System.out.println(e);
		}

	}

}
