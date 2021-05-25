package in.sakthi.validation;

public class AddMedicineValidation {
	  private AddMedicineValidation() {
		    throw new IllegalStateException("AddMedicineValidation");
		  }


	/**
	 * Validation medicinename
	 * 
	 * @param name
	 */

	public static void name(String name) {
		boolean isValid = true;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
				isValid = false;
			}
		}
		if (isValid) {
			System.out.println("The name is:" + name);
			System.out.println("The name is validated...");
		} else
			System.out.println("The Name is not Validated...");
	}

}
