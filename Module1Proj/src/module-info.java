import com.ericsson.test.internal.InterfaceModule1Impl;
import com.ericsson.test.module1.InterfaceModule1;

/**
 * 
 */
/**
 * @author edayyad
 *
 */
module com.ericsson.test.module11 {  
	exports com.ericsson.test.module1;
	
	//exports com.ericsson.test.module1 to com.ericsson.test.module3;
	provides InterfaceModule1 with InterfaceModule1Impl;
	
	opens com.ericsson.test.internal to com.ericsson.module2;
	  
}