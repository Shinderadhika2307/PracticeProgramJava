package String;

public class StringBufferNew {

	public static void main(String[] args) {
		int x=100;
		float y=56.88f;
		boolean b=false;
		double d=700.67;
		StringBuffer s1=new StringBuffer("hi");
		System.out.println(s1.append(x));
		System.out.println(s1.append(y));
		System.out.println(s1.append(b));
		System.out.println(s1.append(d));
		System.out.println("********Finally*********8");
		System.out.println(s1);
		System.out.println("***************");
		StringBuffer s2=new StringBuffer("Mango is national fruit");
		System.out.println(s2);
	    System.out.println(s2.delete(6, 17)); //we delete specific character or substring using delete method
	    
	    System.out.println("***************");
	    StringBuffer s3=new StringBuffer("Rose is beutiful flower");
	    System.out.println(s3);
	    System.out.println(s3.replace(8, 16, "favorite"));//replace substring with given string
	    
	    System.out.println("***************");
	    StringBuffer s4=new StringBuffer("Mahee Sambhaji Deshmukh");
	    System.out.println(s4);
	    System.out.println(s4.reverse());
	    
	    System.out.println("***************");
	    StringBuffer s5=new StringBuffer("Its too late");
	    System.out.println(s5);
	    System.out.println(s5.charAt(4));
	  //  System.out.println(s5.charAt(30)); //StringIndexOutOfBondsException
	    
	    System.out.println("***************");
	    StringBuilder s6=new StringBuilder("Social media");
	    System.out.println(s6.indexOf("media"));
	    
	    System.out.println("***************");
	    StringBuilder s7=new StringBuilder("Elephant likes grass");
	    System.out.println(s7.lastIndexOf("grass"));
	    
	    System.out.println("***************");
	    StringBuilder s8=new StringBuilder("Elephant");
	    System.out.println(s8.length());
		}
}
//append,delete,replace,reverse,charAt,indexOf,length
//Both these classes enable us creating mutable strings in Java.