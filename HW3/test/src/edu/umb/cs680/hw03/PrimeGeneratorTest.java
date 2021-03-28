package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimeGeneratorTest {

	@Test
	public void Prime_Gentest20to30() {
		PrimeGenerator p=new PrimeGenerator(20,30);
		p.generatePrimes();
		Long[] expectedPrimes= new Long[]{23L,29L};
		assertArrayEquals(expectedPrimes,p.getPrimes().toArray());
		
		
	}

	@Test
	public void Prime_Gentest50to80() {
		PrimeGenerator p1=new PrimeGenerator(50,80);
		p1.generatePrimes();
		Long[] expectedPrimes=new Long[] {53L,59L,61L,67L,71L,73L,79L};
		assertArrayEquals(expectedPrimes,p1.getPrimes().toArray());
	}
	
	@Test
	public void Prime_Gentest30to30() {
		long from=30;
		long to=30;
				try {
					PrimeGenerator p2=new PrimeGenerator(from,to);
					p2.generatePrimes();
					Long[] expectedPrimes = {};
					assertArrayEquals(expectedPrimes,p2.getPrimes().toArray());
					
				}catch(RuntimeException e) {
					assertEquals("Wrong input values: from=" + from + " to=" + to,e.getMessage());
					
				}
				
	}
	@Test
	public void Prime_Gentest_negative_35to35() {
		long from=-35;
		long to=35;
				try {
					PrimeGenerator p3=new PrimeGenerator(from,to);
					p3.generatePrimes();
					Long[] expectedPrimes = {};
					assertArrayEquals(expectedPrimes,p3.getPrimes().toArray());
					
				}catch(RuntimeException e) {
					assertEquals("Wrong input values: from=" + from + " to=" + to,e.getMessage());
					
				}
				
	}
	
	@Test
	public void Prime_Gentest_negative_50to1() {
		long from=50;
		long to=1;
				try {
					PrimeGenerator p3=new PrimeGenerator(from,to);
					p3.generatePrimes();
					Long[] expectedPrimes = {};
					assertArrayEquals(expectedPrimes,p3.getPrimes().toArray());
					
				}catch(RuntimeException e) {
					assertEquals("Wrong input values: from=" + from + " to=" + to,e.getMessage());
					
				}
				
	}
	
	
	
	
	
	
}
