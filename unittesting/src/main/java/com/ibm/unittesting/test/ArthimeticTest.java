package com.ibm.unittesting.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.ibm.unittesting.maths.Arthimetic;

public class ArthimeticTest {
	  static Arthimetic arthimetic;
	@BeforeAll
	 static void setUpBeforeClass() throws Exception {
//		System.out.println("Starting the arthimetic class");
		arthimetic = new Arthimetic();
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
//		System.out.println("Ending the arthimetic class");
	}

	@BeforeEach
	public void setUp() throws Exception {
//		System.out.println("Start of the arthimetic");
	}

	@AfterEach
	public void tearDown() throws Exception {
//		System.out.println("End of the arthimetic");
	}

	@Test 
	final void testSum() {
		int expectedReult=6;
		int actualResult=arthimetic.Sum(2,4);
		assertEquals("Comparing results", expectedReult, actualResult);
//		fail("Not yet implemented");
	}
	@ParameterizedTest
	@CsvSource({"2,3,5","-1,1,0","0,0,0","10,-5,5"})
	void testSum(int num1,int num2,int expected) {
		assertEquals(expected,arthimetic.Sum(num1, num2));
	}
	@ParameterizedTest
	@ValueSource(ints= {1,3,5,-3,15,Integer.MAX_VALUE})
	void testIsOdd(int number) {
		assertTrue(number %2!=0);
	}
	@ParameterizedTest
	@ValueSource(strings= {"racec","radar","level","rotor"})
	void testLength(String text) {
		assertTrue(text.length()==5);
	}
	@ParameterizedTest
	@CsvSource({"apple,5","banana,6","'',0","hello IBMer,11"})
	void testStringLength(String input,int expectedLength) {
		assertEquals(input.length(), expectedLength);
	}
	
//	@Test
//	public void testSub() {
//		int expectedresult=6;
//		Arthimetic arthimetic=new Arthimetic();
//		int actualResult=arthimetic.Sub(9,3);
//		assertEquals("Comparing the Subraction results", expectedresult, actualResult);
//	}
//	@Test
//	public void testMul() {
//		int expectedresult=6;
//		Arthimetic arthimetic=new Arthimetic();
//		int actualResult=arthimetic.Mul(3,2);
//		assertEquals("Comparing the Multipication results", expectedresult, actualResult);
//	}
//	@Test
//	public void testDiv() {
//		int expectedresult=6;
//		Arthimetic arthimetic=new Arthimetic();
//		int actualResul t=arthimetic.Div(12,2);
//		assertEquals("Comparing the Division results", expectedresult, actualResult);
//	}

}
