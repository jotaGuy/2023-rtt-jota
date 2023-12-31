package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle();
		rect.setName("Rectangle");
		rect.setHeight(10);
		rect.setWidth(5);
		
		Circle circle = new Circle();
		circle.setName("Circle");
		circle.setDiameter(100);
		circle.getRadius();
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(rect);
		shapes.add(circle);
		
		for (Shape shape: shapes) {
			if (shape instanceof Circle ) {
				// do something
				Circle c = (Circle) shape;
				c.getRadius();
			}
		}
		
		System.out.println("The area of this Circle is: " + circle.calculateParameter());
		System.out.println("The area of this Rectangle is: " + rect.calculateArea());

	}

}
