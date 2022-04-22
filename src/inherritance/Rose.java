package inherritance;
public class Rose extends Flower {

	public static void main(String[] args) {
		type="rose";
		System.out.println(type);
		
		Rose r=new Rose();
		r.color="red";
		System.out.println(r.color);
		smell(" pleasant ");
		r.use(" making perfume and beuty products ");
		
	}

}
//rose is subclass of flower
//single level inheritance
//rose having properties of flower and rose class