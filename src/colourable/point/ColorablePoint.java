package colourable.point;

import java.awt.Color;

import colorable.Colorable;

public class ColorablePoint extends Point implements Colorable{

	private Color color;
	
	public ColorablePoint(int x, int y, Color color) {
		super(x,y);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorablePoint [color=" + color + "]";
	}
	
	public Color getColor() {

		return color;
	}
	
	public Color setColor() {
		this.color = color;
	}
}
