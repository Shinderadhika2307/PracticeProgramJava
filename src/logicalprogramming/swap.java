package logicalprogramming;

public class swap {
	static int p=100;
	static int q=200;
	static int r=0;
	public static void main(String[] args) {
		int a=30;
		int b=40;
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("for globle variable swapping");		
		r=p;
		p=q;
		q=r;
		System.out.println(p);
		System.out.println(q);

	}

}
