package by.htp.homework.state;

import java.util.ArrayList;
import java.util.List;

public class StateMain {

	public static void main(String[] args) {

		ItemFiller newItem = new ItemFiller();
		newItem.cityFiller();
		newItem.regionFiller();
		newItem.districtFiller();
		newItem.stateFiller();
		
		StateLogic logic = new StateLogic();
		String capital = logic.getCapital(newItem.belarus);
		List<String> districtCenter = logic.getDistrictCenterList(newItem.belarus);
		int districtQuantity = logic.countOfDistrict(newItem.belarus);
		
		StateView view = new StateView();
		view.printState(newItem.belarus, capital);
		view.printDistrictInformation(districtCenter, districtQuantity);
		

	}

}
