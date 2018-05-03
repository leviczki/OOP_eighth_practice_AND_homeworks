package testek;

public abstract class Prism {

	private int height;
	
	public Prism(int height) {
		
		this.height = height;
		
	}
	
	public abstract double getBaseArea();
	
	public int getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return getHeight()*getBaseArea();
	}
	
	public boolean hasonlit(Prism x) {
		if(x.getBaseArea() < this.getBaseArea())
			return true;
		
		return false;
	}
	
	
	
}
