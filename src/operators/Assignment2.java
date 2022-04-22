package operators;

public class Assignment2 {

	public static void main(String[] args) {
	int p=10, q=20, r=0;
	r-=p*=q+=p+=q;     //0-=10*=20+=10+=20 //-500
System.out.println(r);
	}

}
