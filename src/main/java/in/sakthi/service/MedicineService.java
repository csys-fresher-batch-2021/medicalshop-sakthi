package in.sakthi.service;

import java.util.Map;    

import java.util.TreeMap;

import in.sakthi.validation.AddMedicineValidation;

public class MedicineService {

	private MedicineService() {
	}

	private static final Map<Integer, String> medicines = new TreeMap<>();
     static {
    	 medicines.put(1,"Azithromycin");
    	 medicines.put(2,"Augumentin");
    	 medicines.put(3, "Piroxicam");
    	 }
	/**
	 * List of medicines Added a Medicine
	 */
	public static Map<Integer, String> getMedicines() {
		return medicines;
	}

	/**
	 * Add a medicine and id
	 * 
	 * @param medicineName
	 * @return
	 */
	public static boolean addMedicine(String name,String medicineName) {

		Integer id = medicines.size() + 1; // 11
		medicines.put(id, medicineName);
		AddMedicineValidation.name(name);
		return true;
	}


	/**
	 * Delete a medicine and id
	 * 
	 * @param medicineName
	 * @return
	 */
	public static boolean deleteMedicine(String medicineName) {
		boolean isDeleted = false;
		Integer id = null;
		for(Integer key: medicines.keySet()) {
			String value = medicines.get(key);
			if(value.equalsIgnoreCase(medicineName)) {
				id = key;
				break;
			}
		}
		if(id != null) {
			medicines.remove(id);
			isDeleted = true;
		}
		return isDeleted;

	}

}
