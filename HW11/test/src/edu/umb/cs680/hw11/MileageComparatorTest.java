package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class MileageComparatorTest {

	List<Car> ListOfCars = new ArrayList<Car>();
	@Test
	public void verify_MileageComparator() {
		ListOfCars.add(new Car("MarutiSuzuki", "Swift", 18, 2015, 10000));
		 ListOfCars.add(new Car("KIA", "Soul", 19, 2016, 12000));
		 ListOfCars.add(new Car("Ford", "MustangGT", 21, 2018, 34000));
		 ListOfCars.add(new Car("Maserati", "Ghibli", 22, 2019, 78000));
		 
		 
		 Collections.sort(ListOfCars,new MileageComparator());
		 
		 assertEquals(18, ListOfCars.get(0).getMileage());
		 assertEquals(19, ListOfCars.get(1).getMileage());
		 assertEquals(21,ListOfCars.get(2).getMileage());
		 assertEquals(22, ListOfCars.get(3).getMileage());
		
	}

}