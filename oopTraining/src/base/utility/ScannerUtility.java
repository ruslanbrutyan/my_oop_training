package base.utility;

import java.util.Scanner;

public final class ScannerUtility {

	private ScannerUtility() {
		
	}
	
	public static double getInputDouble() {
		return new Scanner(System.in).nextDouble();
	} 
	
	public static String getInputLine() {
		return new Scanner(System.in).nextLine();
	}

	public static int getUserInput() {
		return new Scanner(System.in).nextInt();
	} 
}
