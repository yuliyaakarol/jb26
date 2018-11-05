package by.epam.les08.main;

public class Payment {
	private String NameOfProduct;
	private double Price;

	public Payment(String _NameOfProduct, double _Price) {
		this.NameOfProduct = _NameOfProduct;
		this.Price = _Price;
	}

	public String getNameOfProduct() {
		return NameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		NameOfProduct = nameOfProduct;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((NameOfProduct == null) ? 0 : NameOfProduct.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Payment other = (Payment) obj;
		if (NameOfProduct == null) {
			if (other.NameOfProduct != null)
				return false;
		} else if (!NameOfProduct.equals(other.NameOfProduct))
			return false;
		if (Double.doubleToLongBits(Price) != Double
				.doubleToLongBits(other.Price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [NameOfProduct=" + NameOfProduct + ", Price=" + Price
				+ "]";
	}

}
