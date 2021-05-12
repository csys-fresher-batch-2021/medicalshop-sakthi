package in.sakthi;

import java.util.ArrayList;
import java.util.List;

public class DisplayMedicine {

	private static List<String> medicines = new ArrayList<String>();

	static {
		medicines.add("Augumentin");
		medicines.add("Azithromycin");
		medicines.add("Paracetommol");
		medicines.add("Piroxicam");
		medicines.add("Ranitidine");
	}

	public static List<String> getMedicines() {
		return medicines;
	}
	
}