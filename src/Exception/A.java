//Declaring checked exception
package Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		demo();

	}
	public static void demo() throws InterruptedException
	{
		int a=100;
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(2000);
			System.out.println(a);
		}
	}
	public static void getdata() throws FileNotFoundException
	{
		FileInputStream file=new  FileInputStream("c:\\lenovo\\file\\sk.xles");
	}
	public static void test() throws FileNotFoundException,InterruptedException
	{
		Thread.sleep(2000);
		FileInputStream file=new  FileInputStream("c:\\lenovo\\file\\sk.xles");
	}

}
//compile aware exception are called as checked exception
//checked exception should eighter declare or handle
//here we have declare exception with the help of throws keyword
//throws keyword must be used with method header
//we can declare multiple exception with the help of throws keyword
