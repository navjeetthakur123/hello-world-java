package jp.co.hcl.mlj.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

class GreeterTest {

	@Test
	final void testSayHello_Success() {
		
		
		Greeter gt = new Greeter(); 
		 assertEquals("Hello world!", gt.sayHello());
	        // TODO
	}
	

}
