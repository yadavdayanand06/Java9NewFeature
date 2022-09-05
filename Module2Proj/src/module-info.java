import com.ericsson.test.module1.InterfaceModule1;

module com.ericsson.module2 {
	exports com.ericsson.test.module2;
	requires com.ericsson.test.module11;
	
	uses InterfaceModule1;
}