package commonsStyles;

//饿汉式，线层安全
public class HungryStyle {
	private static HungryStyle hun = new HungryStyle();
	private HungryStyle() {};
	
	public static HungryStyle getHungry() {
		return hun;
	}
}
