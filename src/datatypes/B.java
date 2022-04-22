package datatypes;

public class B {

	public static void main(String[] args) {
		byte roll_no= 1;
		String name= "Mahee Sambhaji Deshmukh";
		String clssroom= "L.K.G";
		char division= 'A';
		int Maths_mark= 79;
		int English_mark= 88;
		int Science_mark= 66;
		System.out.println("...Students Information...");
		System.out.println("roll number:" +roll_no);
		System.out.println("name:" +name);
		System.out.println("classroom:" +clssroom);
		System.out.println("Division:" +division);
		System.out.println("Maths Marks:" +Maths_mark);
		System.out.println("English Marks:" +English_mark);
		System.out.println("Science Marks:" +Science_mark);
		System.out.println("************************************");
		if(Maths_mark>=35 && English_mark>=40 && Science_mark>=35)
		{
			System.out.println("pass");
		}
			else
			
			{
				System.out.println("fail");
			}
		
		
	}

}
