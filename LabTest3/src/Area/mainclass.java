package Area;

public class mainclass {

	public static void main(String[] args) {
		Rectangle rectangle  = new Rectangle(105,101.1);
		double area1 = rectangle.area();
		System.out.println("Area of Rectangle :  "+area1);
		Square sq = new Square(11.5);
		double area2= sq.area();
		System.out.println("Area of Square :  "+ area2);
	}

}