package by.htp.homework.state;

import java.util.List;

import java.util.ArrayList;

public class StateView {

	public void printState(State state, String capital) {
		System.out.println(state.toString() + "\nCapital: " + capital.toString());
	}
	
	public void printDistrictInformation (List<String> districtCenter, int districtQuantity) {
		String stringForPrint = "[";
		int count = 0;
		for (String item : districtCenter) {
			stringForPrint += item.concat(", ");
			count++;
		}
		if (count > 0) {
			stringForPrint = "\nCount of districts: " + districtQuantity + " "
					+ stringForPrint.substring(0, stringForPrint.length() - 3);
		}
		System.out.print(stringForPrint.concat("]"));
	}
}
