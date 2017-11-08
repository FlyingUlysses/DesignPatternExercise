package commonExample.shape;

public class FactorySingle {
	private static final FactorySingle factory = new FactorySingle();
	private FactorySingle(){}
	public static synchronized FactorySingle  getFactory(){
		return factory;
	}
	
	String getArea(String shapeName){
		if(shapeName.equals("rectangle"))
			return new Rectangle().getArea();
		else
			return new Triangle().getArea();
	}
}
