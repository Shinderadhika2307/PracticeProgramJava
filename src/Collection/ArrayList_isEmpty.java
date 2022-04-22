package Collection;

import java.util.ArrayList;

public class ArrayList_isEmpty {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();
		System.out.println(A1.isEmpty());//True
		A1.add(10);
		System.out.println(A1.isEmpty());//False
		System.out.println(A1);
System.out.println(A1.size());
	}

}

//isEmpty(),size()