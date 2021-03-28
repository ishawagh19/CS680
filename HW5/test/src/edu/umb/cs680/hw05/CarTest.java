package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	
	private String[] carToStringArray(Car c) {
		String[] car_details= {
				c.get_make(),
				c.get_model(),
				String.valueOf(c.get_year())
		};
		
		return car_details;
	}

	@Test
	public void verifyCar_detailsWithMakeModelYear() {
		Car c1=new Car("Toyota","RAV4",80,2018,85000);
		String[] expected= {"Toyota","RAV4","2018"};
		assertArrayEquals(expected,carToStringArray(c1));
		
	}
	
	@Test
	
	public void verifyCar_detailsWithMakeModelYear1_notverified() {
		Car c2=new Car("Toyota","RAV4",70,2018,70000);
		String [] expected={"Toyota","RAV4","2018"};
		assertArrayEquals(expected, carToStringArray(c2));
	}
	
	@Test
	
	public void verifyCar_detailsWithMakeModelYear_notverified() {
		Car c3=new Car("Toyota","RAV4",60,2018,50000);
		String [] expected= {"Toyota","RAV4","2018"};
		assertArrayEquals(expected, carToStringArray(c3));
	}
}
