
package String;

public class StringBuilderPro {

	 public static void main(String[] args) {
		 System.out.println("*************Using StringBuilder****************");
		StringBuilder s1=new StringBuilder("Hellow");
		System.out.println(s1);
        StringBuilder s2=s1;
        s1.append("Hi");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("*************Using String****************");
        String s3="Red";
        String S4=s3;
       System.out.println(S4.concat("Rose")); 
        System.out.println(S4);
        System.out.println(s3);

	}

}
//String is immutable
//StringBuffer and StringBuilder are mutable
//StringBuffer and StringBuilder are present in java.lang package
//StringBuffer and StringBuilder are classes in java
//StringBuffer and StringBuilder are used to create mutable string object
//immutable means ones created cannot modify
//mutable means can change object any time
//StringBuffer and StringBuilder are not allow to create object using assignment operator
//StingBuffer-->Synchronized,thread safe,less efficient
//StringBuilder-->nonSynchronized,no thread safe,more efficient