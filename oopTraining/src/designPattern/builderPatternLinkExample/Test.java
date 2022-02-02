package designPattern.builderPatternLinkExample;

public class Test {
	public static void main(String[] args) {
		Computer myComputer = new Computer.ComputerBuilder("500 GB","2 GB").build();
		myComputer.print();

	}
}
