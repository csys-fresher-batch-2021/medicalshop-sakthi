package in.sakthi;

import java.util.ArrayList;
import java.util.List;

public class DisplayMedicine {
 
	
	private static final List<String> medicines = new ArrayList<>();

	static {
		medicines.add("Augumentin");
		medicines.add("Azithromycin");
		medicines.add("Paracetommol");
		medicines.add("Piroxicam");
		medicines.add("Ranitidine");
	}

	static void display() {
		System.out.println("The Medicine is: " + medicines);
	}

	public static List<String> getMedicines() {
		return medicines;
	}

}