//
package Exception;
import java.io.*;
public class B {

	public static void main(String[] args) {
		try
		{
			FileOutputStream f=new FileOutputStream("F:\\ac.txt");
			System.out.println("File is Created");
		}
		catch(FileNotFoundException obj)
		{
			System.out.println("file is not created");
		}

	}

}

//checked exception is handled here