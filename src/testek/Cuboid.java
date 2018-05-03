package testek;


public class Cuboid extends Prism {
	
	private double a;
	private double b;
	
	public Cuboid(double a, double b, int height) {
		super(height);
		this.a = a;
		this.b = b;
	}

	@Override
	public double getBaseArea() {
		return a*b;
	}
	
	@Override
	public String toString() {
		return "a: "+a+", b: "+b+", magasság: "+this.getHeight()+".";
	}
	
}
