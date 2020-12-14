package by.htp.homework.state;

import java.util.ArrayList;
import java.util.List;

public class ItemFiller {
	public List<City> baranovichskiy = new ArrayList<City>();
	public List<City> brestskiy = new ArrayList<City>();
	public List<City> pinskiy = new ArrayList<City>();
	public List<City> vitebskiy = new ArrayList<City>();
	public List<City> polotskiy = new ArrayList<City>();
	public List<City> orshanskiy = new ArrayList<City>();
	public List<City> gomelskiy = new ArrayList<City>();
	public List<City> mozyrskiy = new ArrayList<City>();
	public List<City> narovljanskiy = new ArrayList<City>();
	public List<City> grodnenskiy = new ArrayList<City>();
	public List<City> volkovyshskiy = new ArrayList<City>();
	public List<City> lidskiy = new ArrayList<City>();
	public List<City> minskiy = new ArrayList<City>();
	public List<City> logoyskiy = new ArrayList<City>();
	public List<City> bobruyskiy = new ArrayList<City>();
	public List<City> nesvizhskiy = new ArrayList<City>();
	public List<City> mogilevskiy = new ArrayList<City>();
	public List<City> borisovskiy = new ArrayList<City>();
	public List<City> zhodinskiy = new ArrayList<City>();

	public List<Region> brestskaya = new ArrayList<Region>();
	public List<Region> vitebskaya = new ArrayList<Region>();
	public List<Region> gomelskaya = new ArrayList<Region>();
	public List<Region> grodnenskaya = new ArrayList<Region>();
	public List<Region> minskaya = new ArrayList<Region>();
	public List<Region> mogilevskaya = new ArrayList<Region>();

	public List<District> belarusDistrict = new ArrayList<District>();

	public State belarus;

	public void cityFiller() {
		minskiy.add(cityAdd("Minsk", true, true, true));
		minskiy.add(cityAdd("Borisov", false, false, true));
		minskiy.add(cityAdd("Molodechno", false, false, false));
		minskiy.add(cityAdd("Sluck", false, false, false));

		brestskiy.add(cityAdd("Brest", false, true, true));
		brestskiy.add(cityAdd("Korbin", false, false, false));

		grodnenskiy.add(cityAdd("Grodno", false, true, true));
		grodnenskiy.add(cityAdd("Slonim", false, false, false));

		gomelskiy.add(cityAdd("Zlobin", false, false, false));
		gomelskiy.add(cityAdd("Gomel", false, true, true));

		pinskiy.add(cityAdd("Pinsk", false, false, true));
		vitebskiy.add(cityAdd("Vitebsk", false, true, true));
		polotskiy.add(cityAdd("Polock", false, false, true));
		orshanskiy.add(cityAdd("Orsha", false, false, true));
		lidskiy.add(cityAdd("Lida", false, false, true));
		narovljanskiy.add(cityAdd("Narovlja", false, false, true));
		mozyrskiy.add(cityAdd("Mozyr", false, false, true));
		volkovyshskiy.add(cityAdd("Volkovysk", false, false, true));
		zhodinskiy.add(cityAdd("Zodino", false, false, true));
		logoyskiy.add(cityAdd("Logojsk", false, false, true));
		borisovskiy.add(cityAdd("Borisov", false, false, true));
		nesvizhskiy.add(cityAdd("Nesviz", false, false, true));
		mogilevskiy.add(cityAdd("Mogilev", false, true, true));
		bobruyskiy.add(cityAdd("Bobrujsk", false, false, true));
	}

	public void regionFiller() {
		brestskaya.add(regionAdd("Baranovichskiy", 0, baranovichskiy));
		// brestskaya.add(regionAdd("Berezovskiy", 0, berezovskiy));
		brestskaya.add(regionAdd("Brestskiy", 0, brestskiy));
		brestskaya.add(regionAdd("Pinskiy", 0, pinskiy));

		gomelskaya.add(regionAdd("Gomelskiy", 0, gomelskiy));
		// gomelskaya.add(regionAdd("Zhlodinskiy", 0, zhlodinskiy));
		gomelskaya.add(regionAdd("Mozyrskiy", 0, mozyrskiy));
		gomelskaya.add(regionAdd("Narovljanskiy", 0, narovljanskiy));

		grodnenskaya.add(regionAdd("Volkovyshskiy", 0, volkovyshskiy));
		grodnenskaya.add(regionAdd("Grodnenskiy", 0, grodnenskiy));
		grodnenskaya.add(regionAdd("Lidskiy", 0, lidskiy));

		// vitebskaya.add(regionAdd("Braslavskiy", 0, braslavskiy));
		vitebskaya.add(regionAdd("Vitebskiy", 0, vitebskiy));
		vitebskaya.add(regionAdd("Orshanskiy", 0, orshanskiy));
		vitebskaya.add(regionAdd("Polotskiy", 0, polotskiy));

		minskaya.add(regionAdd("Borisovskiy", 0, borisovskiy));
		minskaya.add(regionAdd("Logoyskiy", 0, logoyskiy));
		minskaya.add(regionAdd("Minskiy", 0, minskiy));
		minskaya.add(regionAdd("Nesvizhskiy", 0, nesvizhskiy));

		mogilevskaya.add(regionAdd("Bobruyskiy", 0, bobruyskiy));
		mogilevskaya.add(regionAdd("Mogilevskiy", 0, mogilevskiy));
	}

	public void districtFiller() {

		belarusDistrict.add(districtAdd("BRESTSKAYA", 0, brestskaya));
		belarusDistrict.add(districtAdd("VITEBSKAYA", 0, vitebskaya));
		belarusDistrict.add(districtAdd("GOMELSKAYA", 0, gomelskaya));
		belarusDistrict.add(districtAdd("GRODNENSKAYA", 0, grodnenskaya));
		belarusDistrict.add(districtAdd("MINSKAYA", 0, minskaya));
		belarusDistrict.add(districtAdd("MOGILEVSKAYA", 0, mogilevskaya));
	}

	public void stateFiller() {
		belarus = stateAdd("Belarus", 207600, belarusDistrict);
	}

	// + новый город
	public City cityAdd(String city, boolean ifCapital, boolean ifDistrictMainCity, boolean ifRegionMainCity) {
		return new City(city, ifCapital, ifDistrictMainCity, ifRegionMainCity);
	}

	// + новый регион
	public Region regionAdd(String name, double area, List<City> cityListForRegion) {
		return new Region(name, area, cityListForRegion);
	}

	// + новая область
	public District districtAdd(String name, double area, List<Region> regionListForDistrict) {
		return new District(name, area, regionListForDistrict);
	}

	// + новая страна
	public State stateAdd(String name, double area, List<District> districtListForState) {
		return new State(name, area, districtListForState);
	}

}
