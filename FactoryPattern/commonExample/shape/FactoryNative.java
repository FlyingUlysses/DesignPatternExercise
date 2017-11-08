package commonExample.shape;

public class FactoryNative {
	FactoryNative(){
		System.out.println("create native");
	}
	
	String getArea(String shape){
		if(shape.equals("rectangle"))
			return new Rectangle().getArea();
		else
			return new Triangle().getArea();
	}
}
