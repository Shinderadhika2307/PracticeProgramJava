package encapsulation;

public class Bike {
	private String bikeName;
	private  String model;
	private String engine;
	
	public Bike(String bikeName,String model,String engine)
	{
		this.bikeName=bikeName;
		this.model=model;
		this.engine=engine;
	}
	public String getBikeName()
	{
		return bikeName;
	}
	public String getModel()
	{
		return model;
	}
	public String getEngine()
	{
		return engine;
	}

}

