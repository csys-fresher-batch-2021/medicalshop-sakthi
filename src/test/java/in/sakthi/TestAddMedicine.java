package in.sakthi;

import org.junit.Test;

import in.sakthi.validation.AddMedicineValidation;

public class TestAddMedicine {

	@Test
	public void testcase() {

		Integer id = 1;
		String name = "Norlut";
		AddMedicineValidation.name(name);

	}

}
