package Shape;

import base.ShapeBase;

public class Traingle extends ShapeBase{

	public Traingle(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	public int calculateArea() {
		return width*height/2;
	}

}
