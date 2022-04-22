//write a program to find area and perimeter of rectangle
//area=length*height
//perimeter= 2*(length+height)

package logicalprogramming;
import java.util.Scanner;
public class F {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		int length=sc.nextInt();
		System.out.println("enter height:");
		int height=sc.nextInt();
		System.out.println("Area of rectangle is:");
		double area= length*height;
		System.out.println(area);
		System.out.println("Perimeter of rectangle is:");
		double perimeter=2*(length+height);
		System.out.println(perimeter);
		
	}

}
