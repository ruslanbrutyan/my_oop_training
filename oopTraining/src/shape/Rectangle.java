package shape;

public class Rectangle extends Shape {
	double height;
	double width;
	public Rectangle(double height,double width) {
		this.height=height;
		this.width=width;
	}
	@Override
	public double getSquare() {
		return height*width;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}
}
