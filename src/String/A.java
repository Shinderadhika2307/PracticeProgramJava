package String;
public class A {
	public static void main(String args[])
	{
		//creating object using assignment operator
	String s1="Pune"; //s1 is object 
	System.out.println(s1);
	s1="Mumbai";
	System.out.println(s1);
		String p="Rose";
	String q=p;
	System.out.println(p==q);// compaire address //true
	String r="Rose";
	System.out.println(p==r); //Same data will be store at same address in string constant area //true
	String s="rose";
	System.out.println(p==s);//false//different address
		//creating object using new keyword
	String a=new String();
	System.out.println(a); //nothing will print
		String b=new String("Mango");
	System.out.println(b);
		char ch[]= {'a','b','c','d'};
	String c=new String(ch); //converts character array to string
	System.out.println(c);
		String d="bike";
	String e=new String(d);
	System.out.println(e);
	String o="bike";
	System.out.println(d==o);
		String f=new String("Mango");
	System.out.println(b==f); //false
			}
}
//String is class in java which is present in java.lang package
//String is nothing but array of character
//String is non primitive datatype, so size of string is not fixed
//String class is subclass of object class
//String Class is final Class, so we can not inherite String class, so we cannot override methods of string
//String object created using assignment operator will be store in string constant pool area
//String object created using new keyword are stored in String non constant pool area
//(==)equality operator is used to compare address of two string
//equals() method of string is used to compare actual data