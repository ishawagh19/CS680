package edu.umb.cs680.hw01;


	


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculatorTest {
	@Test
	public void multiply3By4() {
		calculator cut = new calculator();
		float expected = 12;
		float actual = cut.multiply(3,4);
		assertTrue(cut instanceof calculator);
		assertEquals(expected, actual);
	}
	@Test
	public void divide3By2(){
		calculator cut = new calculator();
		float expected = 1.5f;
		float actual = cut.divide(3,2);
		assertEquals(expected, actual);
	}
	@Test
	public void divide5By0withTryCatch(){
		calculator cut = new calculator();
		try{
			cut.divide(5, 0);
			fail("Division by zero");
		}
		catch(IllegalArgumentException ex){
			assertEquals("division by zero", ex.getMessage());
		}
	}
}
