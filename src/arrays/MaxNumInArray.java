package arrays;

public class MaxNumInArray {

	public static void main(String[] args) {
		int a[]= {10,39,45,23,90};
		int maxNum=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(maxNum<a[i])
			{
				maxNum=a[i];
			}
		}
		System.out.println("Maximum number is: "+maxNum);

	}

}
