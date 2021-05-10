package in.sakthi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisplayMedicine {

	@Test
	public void test() {

		// DISPLAY THE MEDICINE
		System.out.println("#####DISPLAY THE MEDICINE NAME#####");
		String[] medicineName = { "1.Augumentin", "2.Azithromycin", "3.Paracetommol", "4.Ranitidine", "5.piroxicam" };
		DisplayMedicine.name(medicineName);
	}

}
