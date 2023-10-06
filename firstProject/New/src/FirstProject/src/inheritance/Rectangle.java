package inheritance;

public class Rectangle extends Shape {

	private double height;
	private double width;
	
	public Rectangle() {
		super();
	}
	
	// this is the specific formula for the area 
	// of a rectangle.  This is implementation of
	// the Area interface
	@Override
	public double calculateArea() {
		return height * width;
	}
	
	@Override
	public double calculateParimiter() {
		return (2*width) + (2*height);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		// this is overriding the toStrign method of the Java Object
		return getName();
	}

	
	
	
	// this is an example of overloading not to be confused with overriding
	// overloading is based on the data type of the arguments
	public void method1(String arg1) {
		
	}
	
	public void method1(int arg1) {
		
	}
	
	

}
