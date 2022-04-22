package constructorInheritance;

public class RunXYZ extends Z {

	public static void main(String[] args) {
		new X();
		System.out.println("*****************");
		new X('b');
		System.out.println("*****************");
		new X(100);
		System.out.println("*****************");
		new Y(23.878);
		System.out.println("*****************");
		new Y(45,'t');
		System.out.println("*****************");
		new Z();
		System.out.println("*****************");
		new Z(67);

	}

}
//Super call statement should be the first statement in constructor
//Super call statement we can use in constructor only
//We can not use more than one super call statement in one constructor
//Super call statement search for constructor of superclass which having matching paranthesis for super call statement
