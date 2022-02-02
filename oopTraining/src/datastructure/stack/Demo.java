package datastructure.stack;

import base.utility.ScannerUtility;

public class Demo {
	public static void main(String[] args) {

//    Stack staticStack = new StackIntStatic(10);
//    for(int i=0;i <11;i++) {
//    	staticStack.push(i);
//    }
//    for(int i=0;i <11;i++) {
//    staticStack.pop();
//    }   
//    Stack dynamicStack = new StackIntDynamic();
//    for(int i=0;i <31;i++) {
//    	dynamicStack.push(i);
//    }
//    for(int i=0;i <33;i++) {
//    	dynamicStack.pop();
//    }
		Stack newStack = null;

		System.out.println("Enter 1 for static stack, enter 2 for dynamic stack");

		newStack = new StackFactory().makeStack(ScannerUtility.getUserInput());

	}
}
