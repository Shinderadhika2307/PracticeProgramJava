//converting primitive datatype to String using valuOf() method
//valueOf method is static and overloaded
package String;

public class PrimitiveToString {

	public static void main(String[] args) {
		int a=10;
		String s1=String.valueOf(a);
		System.out.println(s1); //10
		System.out.println(s1+324); //10324
		
		boolean b=false;
		String s2=String.valueOf(b);
		System.out.println(s2);//false
		System.out.println(s2+123);//false123
		
		double d=58.99;
		String s3=String.valueOf(d);
		System.out.println(s3); //58.99
		System.out.println(s3+55.99); //58.9955.99
		
		char[]ch= {'a','p','m','n'};
		String s4=String.valueOf(ch);
		System.out.println(s4); //apmn
		//or
		String s5=new String(ch);
		System.out.println(s5);//apmn
		
	}

}
