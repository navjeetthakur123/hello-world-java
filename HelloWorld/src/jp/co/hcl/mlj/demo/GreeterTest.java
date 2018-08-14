package jp.co.hcl.mlj.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class GreeterTest {

	@Test
	final void testSayHello_Success() {
	//public static void testSayHello_Success() {
		jp.co.hcl.mlj.demo.Greeter gt=null;
		gt = new jp.co.hcl.mlj.demo.Greeter(); 
		 assertEquals("Hello world!", gt.sayHello());
		//assertEquals("Hello world!", "Hello world!");
		 System.out.println("Executed the test cases ");
	        // TODO
	}
	

}
