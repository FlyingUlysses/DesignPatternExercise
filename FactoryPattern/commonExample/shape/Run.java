package commonExample.shape;

public class Run {
	public static void main(String[] args) {
//		System.out.println(new FactoryNative().getArea("rectangle"));
//		System.out.println(new FactoryNative().getArea("triangle"));
//		System.out.println(new FactoryNative().getArea("rectangle"));
//		System.out.println(new FactoryNative().getArea("triangle"));
//		System.out.println(new FactoryNative().getArea("rectangle"));
//		System.out.println(new FactoryNative().getArea("triangle"));
//		System.out.println(new FactoryNative().getArea("rectangle"));
//		System.out.println(new FactoryNative().getArea("triangle"));
		
//		Triangle triangle = (Triangle) FactoryUpdate.getArea(Triangle.class);
//		Rectangle rectangle = (Rectangle) FactoryUpdate.getArea(Rectangle.class);
//		System.out.println(triangle.getArea());
//		System.out.println(rectangle.getArea());
//		Triangle triangle1 = (Triangle) FactoryUpdate.getArea(Triangle.class);
//		Rectangle rectangle1 = (Rectangle) FactoryUpdate.getArea(Rectangle.class);
//		System.out.println(triangle1.getArea());
//		System.out.println(rectangle1.getArea());
//		Triangle triangle2 = (Triangle) FactoryUpdate.getArea(Triangle.class);
//		Rectangle rectangle2 = (Rectangle) FactoryUpdate.getArea(Rectangle.class);
//		System.out.println(triangle2.getArea());
//		System.out.println(rectangle2.getArea());
		
		System.out.println(FactorySingle.getFactory().getArea("rectangle"));
		System.out.println(FactorySingle.getFactory().getArea("triangle"));
		System.out.println(FactorySingle.getFactory().getArea("rectangle"));
		System.out.println(FactorySingle.getFactory().getArea("triangle"));
		System.out.println(FactorySingle.getFactory().getArea("rectangle"));
		System.out.println(FactorySingle.getFactory().getArea("triangle"));
		
	}
}
