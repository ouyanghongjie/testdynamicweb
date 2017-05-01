package com.joy.pipeline.test;

import org.junit.Test;

import junit.framework.Assert;

public class UtilTest {
	@Test
	public void testConstructResponse(){
		Util util = new Util();
		String actualResult = util.constructResponse();
		
		Assert.assertTrue(actualResult.contains("hello world"));
	}

}
