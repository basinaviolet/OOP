package by.htp.homework.state;

import java.util.List;

public class City {
	String name;
//	String region;
	boolean isCapital;
	boolean isDistrictMainCity;
	boolean isRegionMainCity;

	public City(String name, boolean isCapital, boolean isDistrictMainCity, boolean isRegionMainCity) {
		super();
		this.name = name;
//		this.region = region;
		this.isCapital = isCapital;
		this.isDistrictMainCity = isDistrictMainCity;
		this.isRegionMainCity = isRegionMainCity;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isisDistrictMainCity() {
		return isDistrictMainCity;
	}

	public void setisDistrictMainCity(boolean isDistrictMainCity) {
		this.isDistrictMainCity = isDistrictMainCity;
	}

	public boolean isisRegionMainCity() {
		return isRegionMainCity;
	}

	public void setisRegionMainCity(boolean isRegionMainCity) {
		this.isRegionMainCity = isRegionMainCity;
	}

	public boolean isisCapital() {
		return isCapital;
	}

	public void setisCapital(boolean isCapital) {
		this.isCapital = isCapital;
	}
/*
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
*/
	public String getAttribut () {
		String stringForReturn = "[";
		if (isCapital) {
			stringForReturn.concat("capital, ");
		}
		if (isDistrictMainCity) {
			stringForReturn.concat("the main city of district, ");
		}
		if (isRegionMainCity) {
			stringForReturn.concat("the main city of region, ");
		}
	//	System.out.println(stringForReturn);
		//return stringForReturn.substring(0, stringForReturn.length()-3).concat("]");
		return stringForReturn.concat("]");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isCapital ? 1231 : 1237);
		result = prime * result + (isDistrictMainCity ? 1231 : 1237);
		result = prime * result + (isRegionMainCity ? 1231 : 1237);
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
		City other = (City) obj;
		if (isCapital != other.isCapital)
			return false;
		if (isDistrictMainCity != other.isDistrictMainCity)
			return false;
		if (isRegionMainCity != other.isRegionMainCity)
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
		return " " + name + getAttribut();
	}

}
