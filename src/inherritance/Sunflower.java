package inherritance;
 class Sunflower extends Flower{
	
	public static void main(String[] args) {
		type ="sunflower";
		System.out.println("Flower name is "+type);
		Sunflower s=new Sunflower();
		s.color="yellow";
		System.out.println("color of flower is "+s.color);
		smell(" no ");
		s.use("making edable oil");
		
	}

}
//hearachical inheritance
//rose and sunflower are subclasses of flower class