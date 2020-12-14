package by.htp.homework.bank;

import java.text.DecimalFormat;

class Customer implements Comparable<Customer>{
		
	private String accountNum;
	private String name;
	private String middleName;
	private String surName;
	private String custPassport;
	private float accBalance;
	private boolean accBlock;// 0 - open, 1 - block

	public Customer (String accountNum, String name, String middleName, String surName, String custPassport, float accBalance, boolean accBlock) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.surName = surName;
		this.middleName = middleName;
		this.custPassport = custPassport;
		this.accBalance = accBalance;
		this.accBlock = accBlock;
		
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getCustPassport() {
		return custPassport;
	}

	public void setCustPassport(String custPassport) {
		this.custPassport = custPassport;
	}

	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	public boolean isAccBlock() {
		return accBlock;
	}

	public void setAccBlock(boolean accBlock) {
		this.accBlock = accBlock;
	}
	
	
	
	@Override
	public String toString() {
		DecimalFormat balanceF = new DecimalFormat("######.##");
		return "Customer [" + surName + " " + name + " " + middleName + " " + ", account number: " + accountNum + ", passport: " + custPassport + ", balance: " + balanceF.format(accBalance) + ", block: " + accBlock + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(accBalance);
		result = prime * result + (accBlock ? 1231 : 1237);
		result = prime * result + ((accountNum == null) ? 0 : accountNum.hashCode());
		result = prime * result + ((custPassport == null) ? 0 : custPassport.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
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
		Customer other = (Customer) obj;
		if (Float.floatToIntBits(accBalance) != Float.floatToIntBits(other.accBalance))
			return false;
		if (accBlock != other.accBlock)
			return false;
		if (accountNum == null) {
			if (other.accountNum != null)
				return false;
		} else if (!accountNum.equals(other.accountNum))
			return false;
		if (custPassport == null) {
			if (other.custPassport != null)
				return false;
		} else if (!custPassport.equals(other.custPassport))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Customer temp) {
			if (this.surName.compareTo(temp.getSurName()) > 0) {
				return 1;
			}
			if (this.surName.compareTo(temp.getSurName()) < 0) {
				return -1;
			}
			if (this.surName.compareTo(temp.getSurName()) == 0) {
				if (this.name.compareTo(temp.getName()) > 0) {
					return 1;
				}
				if (this.name.compareTo(temp.getName()) < 0) {
					return -1;
				}
				if (this.name.compareTo(temp.getName()) == 0) {
					if (this.middleName.compareTo(temp.getMiddleName()) > 0) {
						return 1;
					}
					if (this.middleName.compareTo(temp.getMiddleName()) < 0) {
						return -1;
					}
					if (this.middleName.compareTo(temp.getMiddleName()) == 0) {
						if (this.custPassport.compareTo(temp.getCustPassport()) > 0) {
							return 1;
						}
						if (this.custPassport.compareTo(temp.getCustPassport()) < 0) {
							return -1;
						}
						return 0;
					}
				}
			}
		return 0;
	}

}
