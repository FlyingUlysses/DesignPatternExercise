package commons.shape;

public class Rectangle extends Shape {
	Rectangle(Draw draw){
		this.draw =draw;
	}
	
	@Override
	void say() {
		draw.say("rectangle");
	}

}
