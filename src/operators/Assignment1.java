package operators;

public class Assignment1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a); //10
		System.out.println(b); //20
		System.out.println(c);  //30
		
		c+=a;
		System.out.println(c); //30+=10 //40
		
		c-=a;
		System.out.println(c); //40-=10 //30
		
		c*=a;
		System.out.println(c); //30*=10 //300
		
		c/=a;
		System.out.println(c); //300/=10 //30
		
		c%=a; 
		System.out.println(c); //30%=10 //0
		
	}

}
