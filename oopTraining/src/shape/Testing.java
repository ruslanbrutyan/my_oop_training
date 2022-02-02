package shape;

public class Testing {
	public static void main(String[] args) {
		Shape shape = ShapeFactory.getShape();
		System.out.println("type is "+shape.getType()+", square is " + shape.getSquare());
	}
	
}
