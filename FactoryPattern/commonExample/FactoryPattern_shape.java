package commonExample;
//较为通用的例子，缺憾在于每次创建一个对象都需要先创建一个工厂对象
public abstract class FactoryPattern_shape {
	
	static class Test{
		public static void main(String[] args) {
			System.out.println(new Factory().getArea("triangle"));
			System.out.println(new Factory().getArea("rectangle"));
		}
	}
	
	static class Factory{
		String getArea(String shape){
			if (shape == "rectangle") {
				return new rectangle().getArea();
			}else{
				return new triangle().getArea();
			}
		}
	}
	
	static abstract class shape{
		abstract String getArea();
	}
	
	static class rectangle extends shape{
		@Override
		String getArea() {
			return "rectangle's area = length * height";
		}
	}
	
	static class triangle extends shape{
		@Override
		String getArea() {
			return "triangle's area = bottom margin * height /2 ";
		}
	}

	
}
