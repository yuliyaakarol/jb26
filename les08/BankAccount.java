package by.epam.les08.main;

public class BankAccount {
	private String ClientName;
	private int AccountNumber;
	private double AccountAmount;
	private String AccountCurrensy;

	public BankAccount(String _ClientName, int _AccountNumber,
			double _AccountAmount, String _AccountCurrensy) {
		this.ClientName = _ClientName;
		this.AccountNumber = _AccountNumber;
		this.AccountAmount = _AccountAmount;
		this.AccountCurrensy = _AccountCurrensy;
	}

	public String getClientName() {
		return ClientName;
	}

	public void setClientName(String clientName) {
		ClientName = clientName;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getAccountAmount() {
		return AccountAmount;
	}

	public void setAccountAmount(double accountAmount) {
		AccountAmount = accountAmount;
	}

	public String getAccountCurrensy() {
		return AccountCurrensy;
	}

	public void setAccountCurrensy(String accountCurrensy) {
		AccountCurrensy = accountCurrensy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(AccountAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((AccountCurrensy == null) ? 0 : AccountCurrensy.hashCode());
		result = prime * result + AccountNumber;
		result = prime * result
				+ ((ClientName == null) ? 0 : ClientName.hashCode());
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
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(AccountAmount) != Double
				.doubleToLongBits(other.AccountAmount))
			return false;
		if (AccountCurrensy == null) {
			if (other.AccountCurrensy != null)
				return false;
		} else if (!AccountCurrensy.equals(other.AccountCurrensy))
			return false;
		if (AccountNumber != other.AccountNumber)
			return false;
		if (ClientName == null) {
			if (other.ClientName != null)
				return false;
		} else if (!ClientName.equals(other.ClientName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [ClientName=" + ClientName + ", AccountNumber="
				+ AccountNumber + ", AccountAmount=" + AccountAmount
				+ ", AccountCurrensy=" + AccountCurrensy + "]";
	}
	
	
	

}
