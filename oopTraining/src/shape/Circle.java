package shape;

public class Circle extends Shape{
	private double radius;
	Circle(double r){
		this.radius=r;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Circle";
	}
	
	public double getSquare() {
		return radius*radius*3.14;
	}
	
}
