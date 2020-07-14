package Test;

import Shape.Rectangle;
import Shape.Traingle;
import base.ShapeBase;



public class Test {
  private static void displayArea(ShapeBase base) {
	  System.out.println("Display the area of shape and "+base.getName() + "width="   + base.getWidth() + "height" + base.getHeight() +    "The area is " +base.calculateArea());
	
}
	public static void main(String[] args) {
	ShapeBase[] shapes=new ShapeBase[2];
	shapes[0]=new Rectangle("rect",10,20);
	shapes[1]=new Traingle("tri",10,20);
	for(int i=0; i<shapes.length; i++) {
		displayArea(shapes[i]);
	}

	}

}
