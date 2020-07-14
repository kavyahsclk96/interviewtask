package Shape;

import base.ShapeBase;

public class Rectangle extends ShapeBase{

	public Rectangle(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	public int calculateArea() {
		return width*height;
	}

}
