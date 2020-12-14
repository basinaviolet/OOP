package by.htp.homework.state;

import java.util.List;

public class District implements ItemOfStateBase{
	/*
	 * BRESTSKAY("Brest", 32786), VITEBSKAY("Vitebsk", 40051), GOMELSKAY("Gomel",
	 * 40372), GRODNENSKAY("Grodno", 25127), MINSKAY("Minsk", 39854),
	 * MOGILEVSKAY("Mogilev", 29068);
	 */

	String name;
	double area;
	List<Region> regionInDistrict; 

	public District (String name, double area, List<Region> regionInDistrict) {
		super();
		this.name =name;
		this.area = area;
		this.regionInDistrict = regionInDistrict;
	}
	
	public String getList () {
		String stringForReturn = "[";
		for (Region item : regionInDistrict) {
			stringForReturn += item.toString().concat(", ");
		}
	//	System.out.println(stringForReturn);
		//return stringForReturn.substring(0, stringForReturn.length()-3).concat("]");
		return stringForReturn.concat("]");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Region> getRegionInDistrict() {
		return regionInDistrict;
	}

	public void setRegionInDistrict(List<Region> regionInDistrict) {
		this.regionInDistrict = regionInDistrict;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regionInDistrict == null) ? 0 : regionInDistrict.hashCode());
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
		District other = (District) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionInDistrict == null) {
			if (other.regionInDistrict != null)
				return false;
		} else if (!regionInDistrict.equals(other.regionInDistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District: " + name + ", area: "	+ area + " km^2. " + getList();
	}

	
}
