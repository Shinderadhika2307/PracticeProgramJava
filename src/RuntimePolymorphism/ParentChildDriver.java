package RuntimePolymorphism;

public class ParentChildDriver {

	public static void main(String[] args) {
		Parent obj=new Parent();
	//	obj.m1(); m1() is private
		obj.m2();
		
		Parent obj1=new Child();
	
		obj1.m2();

	}

}
