package variables;

public class F {
	static int i;
	static int j;
	
	public static void main(String[] args) {
		System.out.println(i);         //0 
		System.out.println(F.j);         //0//using classname
		int i=10;                        //new variable like global variable;
		hello();
		System.out.println(F.i);          //70
		System.out.println(i);           //10
		j=20;                         //reinitialize global variable j
		F.i=30;                       //reinitialize global variable i
		System.out.println(j);         //20
		System.out.println(i);         //10
        System.out.println(F.i);       //30
		i=50;                          //reinitialize global variable i
		System.out.println(i);         //50
		
	}
	
	public static void hello()
	{
		System.out.println(i);
		i=70;
		System.out.println(i); //70 //reinitialize global variable
	}

}
