package com.ericsson.test.module1;

import com.ericsson.test.internal.InterfaceModule1Impl;
import com.ericsson.test.internal.InternalModule1;

public class Main {
	
	public static int getSquare(int x) {
		return x*x;
	}

	public static void main(String[] args) {
		String x = "Welcome to the moduler programming!!!";
		System.out.println(x);
		
		final int staticSquare = InterfaceModule1.getStaticSquare(4);
		System.out.println("staticSquare:"+staticSquare);
		
		InterfaceModule1 intf = new InterfaceModule1Impl();
		System.out.println(intf.getCubeDefault(2));
	}
	
	public int instanceSquare(int x) {
		return new InternalModule1().getSquare(x);
	}
}
