package by.htp.homework.bank;

import java.util.List;

public class CustomerLogic {

	public String setAccNumber(List<String> accNumList) {

		double i;
		int k = 0;
		String num = "";
		do {
			k = 1;
			i = Math.random();
			num = "" + (int) (1000000000 * i);

			if (accNumList.size() == 0) {
				k = 1;
			} else {
				for (String s : accNumList) {
					if (s.compareTo(num) == 0) {
						k = 1;
					}
				}
			}
		} while (k < 1);

		accNumList.add(num);
		return num;
	}

	public String setAccPassport(List<String> accPasList) {

		double i;
		int k = 0;
		String num = "";
		String[] seria = { "BA", "PC", "BU", " PU", "KA", "NI", "PY", "NU", "DI", "KS" };
		do {
			k = 1;
			i = Math.random();
			num = seria[(int) (10 * i)] + (int) (100000 * i);

			if (accPasList.size() == 0) {
				k = 1;
			} else {
				for (String s : accPasList) {
					if (s.compareTo(num) == 0) {
						k = 1;
					}
				}
			}
		} while (k < 1);

		accPasList.add(num);
		return num;
	}

	public float setAccSum() {

		int k = 10;
		double i = Math.random();

		switch ((int) (k * i) % 5) {
		case 0:
			k = -k;
			break;
		case 1:
			k = k * 10;
			break;
		case 2:
			k = k * 100;
			break;
		case 3:
			k = k * 10 * (-1);
			break;
		case 4:
			k = k * 100 * (-1);
			break;
		default:
			k = k * 1000;
			break;
		}
		return (float) (k * i);
	}

	public Customer serchByAcc(String acc, List<Customer> list) {
		Customer customer = null;
		String temp;
		for (Customer obj : list) {
			temp = obj.getAccountNum();
			if (temp.compareTo(acc) == 0) {
				customer = obj;
			}
		}
		return customer;
	}

	public float summaBal(int indicatir, List<Customer> list) {
		float sum = 0;
		float tempBal;
		for (Customer s : list) {
			tempBal = (s.getAccBalance());
			if (s.isAccBlock()) { // not count block account
				if ((indicatir < 0) && (tempBal < 0)) {
					sum += tempBal;
				}
				if ((indicatir > 0) && (tempBal > 0)) {
					sum += tempBal;
				}
				if (indicatir == 0) {
					sum += tempBal;
				}
			}
		}
		return sum;
	}

	public boolean block(String str, List<Customer> list) {
		Customer customer = serchByAcc(str, list);
		if (customer.isAccBlock()) {
			return false;
		} else {
			customer.setAccBlock(true);
			return true;
		}
	}

	public boolean unblock(String str, List<Customer> list) {
		Customer customer = serchByAcc(str, list);
		if (!customer.isAccBlock()) {
			return false;
		} else {
			customer.setAccBlock(false);
			return true;
		}
	}
}
