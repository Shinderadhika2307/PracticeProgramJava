package encapsulation;

public class Employee {
private int empID;
private String empName;
private String contactNo;
private String emailId;
private String city;

public void setEmpID(int empID)
{
	this.empID=empID;
}
public int getEmpID()
{
	return empID;
}

public void setEmpName(String empName)
{
	this.empName=empName;
}
public String getEmpName()
{
	return empName;
}

public void setContactNo(String contactNo)
{
	this.contactNo=contactNo;
}
public String getContactNo()
{
	return contactNo;
}

public void setEmailId(String emailId)
{
	this.emailId=emailId;
}
public String getEmailId()
{
	return emailId;
}

public void setCity(String city)
{
	this.city=city;
}
public String getCity()
{
	return city;
}

}
