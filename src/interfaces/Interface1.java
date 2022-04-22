package interfaces;
public interface Interface1 {
	int a=12;
public abstract void a1();
public abstract void a2();
public abstract void a3();

}
//all non static abstract methods, static concrete method and constants are implicitly public , so interface are declared as public
//void test(); -->abstract public void test();
//static void test(){} -->public static void test(){}
//int a=10; -->public final static int a=10;

//