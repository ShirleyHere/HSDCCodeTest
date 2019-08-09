package com.shirley.hsdc_test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MathGameTest {

	MathGame mg;
	
	@Before
    public  void before() throws Exception{
		mg = new MathGame();
	}
	
	@Test
	public void testCaculate_1(){
		Assert.assertEquals("2", mg.caculate_1(2));
		Assert.assertEquals("Fizz", mg.caculate_1(9));
		Assert.assertEquals("Buzz", mg.caculate_1(10));
		Assert.assertEquals("FizzBuzz", mg.caculate_1(60));
		Assert.assertEquals("53", mg.caculate_1(53));
	}
	@Test
	public void testCaculate_2(){
		Assert.assertEquals("2", mg.caculate_2(2));
		Assert.assertEquals("Fizz", mg.caculate_2(9));
		Assert.assertEquals("Buzz", mg.caculate_2(10));
		Assert.assertEquals("FizzBuzz", mg.caculate_2(60));
		Assert.assertEquals("Fizz", mg.caculate_2(31));
		Assert.assertEquals("Buzz", mg.caculate_2(52));
		Assert.assertEquals("FizzBuzz", mg.caculate_2(53));
	}
}
