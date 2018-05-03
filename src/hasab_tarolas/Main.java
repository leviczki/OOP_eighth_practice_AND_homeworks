package hasab_tarolas;

import testek.Cuboid;
import testek.Cylinder;
import testek.Prism;

public class Main {
	
	public static void main(String[] args) {
		Array_class sajat = new Array_class(5);
		
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("double double int: ");
		sajat.setRef(2, new Cuboid(input.nextDouble(),input.nextDouble(),input.nextInt()));
		
		System.out.println("int double: ");
		sajat.setRef(3, new Cylinder(input.nextInt(), input.nextDouble()));
		
		System.out.println("int double: ");
		sajat.setRef(4, new Cylinder(input.nextInt(), input.nextDouble()));
		
		input.close();*/
		
		Prism egy = new Cuboid(6,6,3);
		
		sajat.setRef(2, egy);
		/*sajat.setRef(3, new Cylinder(3, 9));
		sajat.setRef(4, new Cylinder(12, 2));*/
		
		//Írja ki az összes hasáb adatát, majd a hasábok átlagos térfogatát, és a hengerek számát.
		
		for(int i = 0; i < 5; i++) {
			//System.out.println(sajat.getElem(i).toString());			
		}
		
		System.out.println(sajat.atlagosTerfogat());
		System.out.println(sajat.getHengerek());
	}

}
