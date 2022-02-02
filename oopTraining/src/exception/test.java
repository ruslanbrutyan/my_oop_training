package exception;

public class test {
	static int a = 0;
	static int b = 2;
	static int c = 10;
	public static void main(String[] args) {
	
		try {
			exception();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}}
	public static void exception() {
		int d = c / a;
	};
}
