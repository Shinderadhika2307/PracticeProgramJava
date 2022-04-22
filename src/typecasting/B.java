/* narrowing */
package typecasting;

public class B {

	public static void main(String[] args) {
	
	int a=18909;
	short b= (short)a;  //int to short
	System.out.println(b); //narrowing -12899
	
	float f= 76.34f;
	char ch=(char)f; //float to char
	System.out.println(ch); //narrowing L
	
	double d= 67804.34566;
	int i=(int)d; //double to int
	System.out.println(i);  //narrowing 67804
	
	
	char e= 'L';
	int p=e;
	System.out.println(p);
	
	float g=348.70f;
	long l=(long)g;
	System.out.println(l);
	
	int j=88;
	char k=(char)j;
	System.out.println(k);
	
	
	}

}
