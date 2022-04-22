package inherritance;

public class Tester extends SRS {
 String module="Apply loan";
public static void work()
{
	Tester p=new Tester();
	System.out.println("Prepare test scenarios and test cases for "+p.module);
	System.out.println("perform sanity, system and functionality testing on "+p.module);
	System.out.println("log and track defect");
	
}
	public static void main(String[] args) {
		Tester t=new Tester();
		System.out.println("****************************");
		System.out.println(".....SRS information......");
		System.out.println("Name Of Project "+t.projectName);
		System.out.println("Customer is: "+t.customer);
		System.out.println("SRS created by: "+CreatedBy);
		System.out.println("SRS file Format: "+t.fileFormat);
		System.out.println("SRS total pages: "+noOfPages);
		flowDiagram();
		t.functionalRequirement();
		snapshot();
		t.useCases();
		
		System.out.println("****************************");
		System.out.println(".....Tester information......");
		System.out.println("tester works on: "+t.module);
		work();
		

	}

}
//single level and hierarchical inheritance happens
//SRS>>Sr Developer>>Jr Developer
//SRS>>Tester