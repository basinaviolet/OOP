package by.htp.homework.state;

import java.util.List;

public class Region {

	/*
	 * BRESTSKIY ("BRESTSKAY", "Brest", 1500), BARANOVICHSKIY ("BRESTSKAY",
	 * "Baranovichi", 2171.88), PINSKIY ("BRESTSKAY", "Pinsk", 3255.89), VITEBSKIY
	 * ("VITEBSKAY", "Vitebsk", 2705.12), POLOCKIY ("VITEBSKAY", "Polock", 3178.55),
	 * ORSHANSKIY ("VITEBSKAY", "Orsha", 1000), GOMELSKIY ("GOMELSKAY", "Gomel",
	 * 1951.4), MOZYRSKIY ("GOMELSKAY", "Mozyr", 1000), NAROVLANSKIY ("GOMELSKAY",
	 * "Narovlja", 1000), GRODNENSKIY ("GRODNENSKAY", "Grodno", 2594.05),
	 * VOLKOVYSSKIY ("GRODNENSKAY", "Volkovysk", 1000), LIDSKIY ("GRODNENSKAY",
	 * "Loda", 900), MINSKIY ("MINSKAY", "Minsk", 1902.66), ZODINSKIY ("MINSKAY",
	 * "Zodino", 1000), LOGOYSKIY ("MINSKAY", "Logoysk", 2365.02), BORISOVSKIY
	 * ("MINSKAY", "Borisov", 2987.95), NESVIZSKIY ("MINSKAY", "Nesviz", 900),
	 * MOGILEVSKIY ("MOGILEVSKAY", "Mogilev", 1895.40), BOBRUYSKIY ("MOGILEVSKAY",
	 * "Bobrujsk", 700);
	 */
		
	String name;
	double area;
	List<City> cityInRegion;

	public Region (String name, double area, List<City> cityInRegion) {
		this.name = name;
		this.area = area;
		this.cityInRegion = cityInRegion;
	}
	
	public String getList () {
		String stringForReturn = "[";
		for (City item : cityInRegion) {
			stringForReturn += item.toString().concat(", ");
		}
	//	System.out.println(stringForReturn);
		//return stringForReturn.substring(0, stringForReturn.length()-3).concat("]");
		return stringForReturn.concat("]");
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCityInRegion() {
		return cityInRegion;
	}

	public void setCityInRegion(List<City> cityInRegion) {
		this.cityInRegion = cityInRegion;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cityInRegion == null) ? 0 : cityInRegion.hashCode());
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
		Region other = (Region) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (cityInRegion == null) {
			if (other.cityInRegion != null)
				return false;
		} else if (!cityInRegion.equals(other.cityInRegion))
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
		return "Region: " + name + ", area: "	+ area + " km^2. " + getList();
	}

	
}
