package datastructure.stack;

import java.util.Scanner;

public  class StackFactory {
	
	public Stack makeStack(int i) {
		if (i == 1) {
			Scanner userImputStackSize = new Scanner(System.in);
			System.out.println("Enter size");
			if (userImputStackSize.hasNextInt()) {
				return new StackIntStatic(userImputStackSize.nextInt());
			}else return null;
		}else if(i==2){
			return new StackIntDynamic();
		}else return null;	
	}
}