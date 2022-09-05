package com.ericsson.test.module2;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.ServiceLoader;

import com.ericsson.test.module1.InterfaceModule1;
import com.ericsson.test.module1.Main;

public class Module2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Main main = new Main();
		System.out.println(main.instanceSquare(10));		
		
		final ServiceLoader<InterfaceModule1> services = ServiceLoader.load(InterfaceModule1.class);
		
		InterfaceModule1 intf1= services.iterator().next();
		int cube=intf1.getCube(5);
		System.out.println(cube);
		
		// Reflection is allowed becoz the package is opened to this module
		Class clazz = Class.forName("com.ericsson.test.internal.InterfaceModule1Impl");
		
		final Method[] declaredMethods = clazz.getDeclaredMethods();
		
		if(Objects.nonNull(declaredMethods)) {
			Arrays.asList(declaredMethods).stream().forEach(System.out::println);
		}
		
	}
}
