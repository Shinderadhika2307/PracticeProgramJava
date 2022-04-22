package encapsulation;

public class BikeDriver {

	public static void main(String[] args) {
	Bike obj=new Bike("Bullet","Royal Enfield","100CC");
	System.out.println(obj.getBikeName());
	System.out.println(obj.getModel());
    System.out.println(obj.getEngine());
    
    System.out.println("************");
    System.out.println("We can print like below also");
    
    Bike obj1=new Bike("Hero","Honda","80CC");
	System.out.println(obj1.getBikeName()+" "+obj1.getModel()+" "+obj1.getEngine());
	
	}

}

//setter method is not in bikeclass, so modification is not allowed, only readable data.
//if we add setter method to bike class then we can modify data