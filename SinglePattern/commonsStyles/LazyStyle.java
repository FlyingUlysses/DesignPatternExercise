package commonsStyles;

//懒汉式，线层不安全不完善
public class LazyStyle {
	private static LazyStyle lazy;
	private LazyStyle() {};
	
	public LazyStyle getLazy() {
		if(lazy ==null)
				lazy = new LazyStyle();
		return lazy;
	}
}

//线层安全，但每次都加锁，效率低
class LazyAndSecurity{
	private static LazyAndSecurity lazy;
	private LazyAndSecurity() {};
	
	public synchronized LazyAndSecurity getLazy() {
		if(lazy == null)
			lazy = new LazyAndSecurity();
		return lazy;
	}
}

//懒汉内嵌饿汉式静态类，线层安全，效率相对较高
class Lazy3{
	private static class Lazy3Hoder{
		private static final Lazy3 lazy = new Lazy3();
	}
	private Lazy3() {};
	
	public static Lazy3 getLazy() {
		return Lazy3Hoder.lazy;
	}
	
}
