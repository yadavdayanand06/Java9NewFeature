package com.ericsson.test.module1;

public interface InterfaceModule1 {

	int getCube(int x);
	
	private void displayPrivate() {
		System.out.println("This is from displayPrivate");
	}
	
	default int getCubeDefault(int x) {
		displayPrivate();
		return x*x*x;
	}
	
	public static int getStaticSquare(int x) {
		return x*x;
	}
}
