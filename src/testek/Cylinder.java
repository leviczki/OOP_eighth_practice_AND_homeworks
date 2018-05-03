package testek;


public class Cylinder extends Prism {
	
	private double sugar;
	
	public Cylinder(int height, double sugar) {
		super(height);
		this.sugar = sugar;
	}

	@Override
	public double getBaseArea() {
		return sugar*sugar*Math.PI;
	}
	
	@Override
	public String toString() {
		
		return "Sugár: "+this.sugar+". Magasság: "+this.getHeight()+".";
	}
}
