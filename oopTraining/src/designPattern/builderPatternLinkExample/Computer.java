package designPattern.builderPatternLinkExample;

public class Computer {
		private String HDD;
		private String RAM;

		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		private Computer(ComputerBuilder builder) {
			this.HDD=builder.HDD;
			this.RAM=builder.RAM;
			this.isBluetoothEnabled=builder.isBluetoothEnabled;
			this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
			
		}
		public void print() {
			System.out.println(HDD);
			System.out.println(RAM);
			System.out.println(isGraphicsCardEnabled);
			System.out.println(isBluetoothEnabled);
		}
		public static class ComputerBuilder{
			private String HDD;
			private String RAM;
			private boolean isGraphicsCardEnabled;
			private boolean isBluetoothEnabled;
			public ComputerBuilder(String HDD,String RAM) {
				// TODO Auto-generated constructor stub
				this.HDD=HDD;
				this.RAM=RAM;
			}
			public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
				this.isGraphicsCardEnabled=isGraphicsCardEnabled;
				return this;
			};
			public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
				this.isBluetoothEnabled=isBluetoothEnabled;
				return this;
			}
			public Computer build() {
				return new Computer(this);
			}
			
		}
}
