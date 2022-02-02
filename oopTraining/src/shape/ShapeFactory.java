package shape;

import base.utility.ScannerUtility;

public final class ShapeFactory {
	
	private ShapeFactory() {	
	}
	
	public static Shape getShape() {
		System.out.println("Enter type of Shape Circle/Triangle/Rectangle");
		String typeOfShape= ScannerUtility.getInputLine();
		if (typeOfShape.equals("Triangle")) {
			System.out.println("Enter sides");
			return new Triangle(ScannerUtility.getInputDouble(), ScannerUtility.getInputDouble(), ScannerUtility.getInputDouble());
		} else if (typeOfShape.equals("Circle")) {
			System.out.println("Enter radius");
			return new Circle(ScannerUtility.getInputDouble());
		} else if (typeOfShape.equals("Rectangle")) {
			return new Rectangle(ScannerUtility.getInputDouble(),ScannerUtility.getInputDouble());
		} else {
			return null;
		}
	}
}
