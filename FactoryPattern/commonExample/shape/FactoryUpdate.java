package commonExample.shape;

public class FactoryUpdate {
	FactoryUpdate(){
		System.out.println("create Update");
	}
	
	static Object getArea(Class<? extends Shape> clazz){
		Object obj = null;
		try {obj= Class.forName(clazz.getName()).newInstance();} catch (Exception e) {} 
		return obj;
	}
}
