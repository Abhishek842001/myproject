package Area;

public class Rectangle extends Square {
	public double width;

	public Rectangle(double length, double width) {
		super(length);
		this.width = width;
	}

	@Override
	public double area() {
		return length*width;
	}
	

}