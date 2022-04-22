package String;
import java.util.Arrays;
public class String_methods {
	public static void main(String[] args) {
		String s1="Pune";
		String s2="pune";
		System.out.println(s1.equals(s2)); //false// string are case sensitive
		System.out.println(s1.equals("Pune"));//true
		System.out.println(s1.equalsIgnoreCase(s2)); //true//ignore case
		System.out.println(s1.equalsIgnoreCase(" pune"));//false//space is considered as character in string
		System.out.println(s1.compareTo(s2)); //-32//if diff then any integer value
		System.out.println(s1.compareTo("Pune"));//if same 0
		System.out.println(s1.compareToIgnoreCase(s2));//0//ignore case
		System.out.println(s1.indexOf('n')); //2//index starts from 0
		System.out.println(s1.indexOf('s')); //if no similar character then returns negative
		System.out.println(s1.indexOf("ne"));//2
		System.out.println(s1.replace('e','n'));//Punn
		System.out.println(s2.replace("pune", "mumbai"));//mumbai //System.out.println(s1.replace("Pune",'P'));//not possible
		System.out.println(s1.endsWith("nE")); //false
		System.out.println(s1.endsWith("ne")); //true
		System.out.println(s1.endsWith(" ne")); //false
		System.out.println(s1.startsWith("P")); //true//for startswith and endswith only string are acceptable in brackets, characters are not allowed
		System.out.println(s1.startsWith("Pu ")); //false
		System.out.println(s1.concat(s2)); //Punepune
		System.out.println(s1.concat("Mumbai")); //PuneMumbai
		System.out.println(s1.length());//4
		String s3="Mango is national fruit";
		String[] ch=s3.split(" ");
		System.out.println(Arrays.toString(ch));//[Mango, is, national, fruit]
		String[] p=s3.split("o");
		System.out.println(Arrays.toString(p));//[Mang,  is nati, nal fruit]
		System.out.println(s1.substring(2)); //ne
		System.out.println(s3.substring(0, 9)); //Mango is
		String s4=" Mumb ppp  ";
		System.out.println(s4.trim()); //remove spaces from beginning and end
		System.out.println(s3.contains("is")); //true
		//System.out.println(s3.contains('p')); char not applicable
		String s5="Bike";
		String s6=new String("Bike");
		String s7=s6.intern();
		System.out.println(s5==s7);//true
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s4.charAt(2));//u
		
	
		
		

		
	}

}
