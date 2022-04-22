package encapsulation;
public class employeeDriver {   //encapsulation class
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEmpID(1);
		obj.setEmpName("Radhika");
		obj.setContactNo("2578964689");
		obj.setEmailId("sfg@gjll.com");
		obj.setCity("pune");
				System.out.println(obj.getEmpID());
				System.out.println(obj.getEmpName());
				System.out.println(obj.getContactNo());
				System.out.println(obj.getEmailId());
				System.out.println(obj.getCity());
System.out.println("*************************");
Employee obj1=new Employee();
obj1.setEmpID(2);
obj1.setEmpName("Sakshi");
obj1.setContactNo("564678000");
obj1.setEmailId("xyz@gjll.com");
obj1.setCity("satara");
		System.out.println(obj1.getEmpID());
		System.out.println(obj1.getEmpName());
		System.out.println(obj1.getContactNo());
		System.out.println(obj1.getEmailId());
		System.out.println(obj1.getCity());
System.out.println("*************************");
obj1.setCity("Wai");                               //modifying
System.out.println(obj1.getEmpID());
System.out.println(obj1.getEmpName());
System.out.println(obj1.getContactNo());
System.out.println(obj1.getEmailId());
System.out.println(obj1.getCity());
	}
}
//encapsulation means binding data members and behavior of class together, and make data members not get used directly outside the class.
//rather than use nonstatic getter and setter methods
//with the only use of getter we can allow user for read only
//with the only use of setter we can allow user for modify only
//with the help of getter and setter we can allow user for read and modify both