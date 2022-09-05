package com.ericsson.test.internal;

import com.ericsson.test.module1.InterfaceModule1;

public class InterfaceModule1Impl implements InterfaceModule1 {

	@Override
	public int getCube(int x) {
		
		return x*x*x;
	}

}
