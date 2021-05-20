package in.sakthi.service;

import java.util.ArrayList;
import java.util.List;

import in.sakthi.model.Medicine;

public class MedicineService {
	
	 private MedicineService() {
		    throw new IllegalStateException("Medicine Service");
		  }
	
	private static final List<Medicine> medicines = new ArrayList<>();
    /**
     * List of medicines
     * Added a Medicine
    */
    public static  List<Medicine> getMedicines() {
		return medicines;
	}
    public static boolean addMedicine(String medicineName) {
		boolean isAdded = false;
		System.out.println("Successfully added " + medicineName);
		int id = medicines.size() + 1; //11
		medicines.add(new Medicine(id, medicineName));
		isAdded=true;
		return isAdded;
	}
	public static boolean Medicines() {
		return false;
	}
	

}
