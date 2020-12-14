package by.htp.homework.state;

import java.util.List;

public class State {
	/*
	 * BRESTSKAY("Brest", 32786), VITEBSKAY("Vitebsk", 40051), GOMELSKAY("Gomel",
	 * 40372), GRODNENSKAY("Grodno", 25127), MINSKAY("Minsk", 39854),
	 * MOGILEVSKAY("Mogilev", 29068);
	 */

	String name;
	double area;
	List<District> districtInState;

	public State(String name, double area, List<District> districtInState) {
		super();
		this.name = name;
		this.area = area;
		this.districtInState = districtInState;
	}

	public String getList() {
		String stringForReturn = "\nDistricts [";
		int count = 0;
		for (District item : districtInState) {
			stringForReturn += item.getName().concat(", ");
			count++;
		}
		if (count > 0) {
			stringForReturn = stringForReturn.substring(0, stringForReturn.length() - 3);
		}
		return stringForReturn.concat("]");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<District> getDistrictInState() {
		return districtInState;
	}

	public void setDistrictInState(List<District> districtInState) {
		this.districtInState = districtInState;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((districtInState == null) ? 0 : districtInState.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (districtInState == null) {
			if (other.districtInState != null)
				return false;
		} else if (!districtInState.equals(other.districtInState))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State: " + name + ", area: " + area + " km^2. " + getList();
	}

}
