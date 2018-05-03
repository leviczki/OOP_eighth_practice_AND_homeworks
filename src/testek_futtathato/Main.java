package testek_futtathato;

import testek.Cuboid;
import testek.Cylinder;

public class Main {

	public static void main(String[] args) {
		Cylinder x = new Cylinder(5, 6.8);
		System.out.println("Henger: "+x.toString());
		
		Cuboid y = new Cuboid(6.1, 7.2, 3);
		System.out.println("Cuboid: "+y.toString());
		
		System.out.println("y.hasonlit(x): "+y.hasonlit(x));
		
		System.out.println(x.getClass() +" "+y.getClass());
	}
	
}
