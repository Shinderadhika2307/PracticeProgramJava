package constructorInheritance;
public class ClassD extends ClassC{
public ClassD()
{
		System.out.println("from D()");
}
	public static void main(String[] args) {
		ClassD obj=new ClassD();
	}
}
//This is also called constructor chaining
//order of innocation...
//C>>B>>A>>Object
//Order of execution....
//object>>A>>B>>C
//this autocalling is happen if constructors are zero argument constructor
//For parameterized constructor we whould use super call statement