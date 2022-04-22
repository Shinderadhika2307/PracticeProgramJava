package RuntimePolymorphism;

public class Forest {

	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.talk();
		Dog obj1=new Dog();
		obj1.talk();
		Animal obj2=new Dog();  //upcasting
		obj.talk();
		((Dog)obj2).bark();
		Tiger obj3=new Tiger();
		obj3.talk();
		Animal obj4=obj3;
		obj4.talk();
		
		
		
	}

}
