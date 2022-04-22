package inherritance;

public class JrDeveloper extends SrDeveloper {
String module2="view balance";
int a=20;
static int b=40;
public void jrWork()
{
	System.out.println("Jr developer work on sub modules");
	System.out.println("Complete work on given time");
	System.out.println("Contact Sr developer if any issue");
}
public static void main(String[] args) {
		JrDeveloper j=new JrDeveloper();
		System.out.println(j.a);
		SrDeveloper s=new SrDeveloper();
		System.out.println(s.a);     //nonstatic variable of sublass and superclass same then call them using object of perticular class
		System.out.println(b);
		System.out.println(SrDeveloper.b);
		System.out.println("****************************");
		System.out.println(".....SRS information......");
		System.out.println("Name Of Project "+j.projectName);
		System.out.println("Customer is: "+j.customer);
		System.out.println("SRS created by: "+CreatedBy);
		System.out.println("SRS file Format: "+j.fileFormat);
		System.out.println("SRS total pages: "+noOfPages);
		flowDiagram();
		j.functionalRequirement();
		snapshot();
		j.useCases();
		
		System.out.println("****************************");
		System.out.println(".....SR Developer information......");
		System.out.println("sr developer works on: "+j.module1);
		srWork();
		
		System.out.println("****************************");
		System.out.println(".....JR Developer information......");
		System.out.println("jr developer works on: "+j.module2);
		j.jrWork();
	}
}
//here srDeveloper is submodule of srs and jrDeveloper is submodule of srDeveloper
//so bydefault jrDeveloper is submodule of SRS
//multilevel inheritance
//SRS>>Sr Developer>> Jr Developer