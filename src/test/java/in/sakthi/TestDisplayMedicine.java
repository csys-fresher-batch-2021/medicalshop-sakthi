package in.sakthi;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;

public class TestDisplayMedicine {

	@Test
	public void testcase() {

		// DISPLAY THE MEDICINE
		System.out.println("#####DISPLAY THE MEDICINE NAME#####");
		List<String> medicines = DisplayMedicine.getMedicines();
		System.out.println("The Medicine is: "+medicines);
		assertEquals(5, medicines.size());
	}


}
