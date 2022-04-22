//find perimeter and radius of circle for given radius
//perimeter 2*pi*r
//area pi*r*r
//math.PI
package logicalprogramming;
import java.util.Scanner;
public class D {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r= S.nextInt();
		double perimeter=2*Math.PI*r;
		double area=Math.PI*r*r;
		System.out.println("Perimeter of circel is:"+perimeter);
		System.out.println("Area of circel is:"+area);

	}

}
