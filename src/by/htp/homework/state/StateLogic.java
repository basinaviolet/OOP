package by.htp.homework.state;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {

	public String getCapital(State stateForCapital) {
		String capital = "the capital is not found.";

		for (District districtItem : stateForCapital.getDistrictInState()) {
			for (Region regionItem : districtItem.getRegionInDistrict()) {
				for (City cityItem : regionItem.getCityInRegion()) {
					if (cityItem.isCapital) {
						capital = cityItem.getName();
					}
				}
			}
		}

		return capital;
	}

	int countOfDistrict(State stateForCapital) {
			return stateForCapital.getDistrictInState().size();
	}

	public List<String> getDistrictCenterList (State stateForCapital) {
		List<String> districtCenterList = new ArrayList<String>();

		for (District districtItem : stateForCapital.getDistrictInState()) {
			for (Region regionItem : districtItem.getRegionInDistrict()) {
				for (City cityItem : regionItem.getCityInRegion()) {
					if (cityItem.isDistrictMainCity) {
						districtCenterList.add(cityItem.getName());
					}
				}
			}
		}

		return districtCenterList;
	}

}
