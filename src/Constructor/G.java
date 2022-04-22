package Constructor;

public class G {
	int a;
	
public G(int b)
{
	a=b;  //if locan variable and global variable diff then no need of this keyword
}
	public static void main(String[] args) {
		
	G obj=new G(10);
	System.out.println(obj.a);

	}

}
