package Area;
public class Square implements Shape {
	public double length;

	
	public Square(double length) {
		this.length = length;
	}


	@Override
	public double area() {
		return length*length;
	}

}