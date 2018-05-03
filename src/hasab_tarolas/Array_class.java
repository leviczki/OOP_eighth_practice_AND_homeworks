package hasab_tarolas;

import testek.Cylinder;
import testek.Prism;

public class Array_class {
	
	private int darab;
	
	public Array_class(int darab) {
		this.darab = darab;
	}
	
	Prism[] tomb = new Prism[darab];
	
	
	
	
	public void setRef(int index, Prism x) {
		tomb[index] = x;
	}
	
	public int getDarab() {
		return darab;
	}
	
	public Prism getElem(int index) {
		return tomb[index];
	}
	
	public int getNotNull() {
		int counter = 0;
		
		for(Prism x : tomb) {
			if(x != null)
				counter++;
		}
		
		return counter;
	}
	
	public double atlagosTerfogat() {
		double ossz = 0;
		
		for(Prism x : tomb) {
			if(x != null)
				ossz += x.getBaseArea();
		}
		
		return ossz/getNotNull();
	}

	public double getBaseArea(int index) {
		if(tomb[index] != null)
			return tomb[index].getBaseArea();
		
		return 0;
	}
	
	public int getHengerek() {
		int counter = 0;
		
		for(Prism x : tomb) {
			//if(x.getClass().equals("class testek.Cylinder"))
			//if(x.getClass().toString().contains("Cylinder"))
			if(x instanceof Cylinder)
				counter++;
		}
		
		return counter;
	}

}
