package by.epam.les09.main;

public class PrintedEdition {
	private String EditionTitle;
	private int Published;
	private int Price;
	private String PublishingRegion;

	public PrintedEdition(String _EditionTitle, int _Published, int _Price,
			String _PublishingRegion) {
		this.EditionTitle = _EditionTitle;
		this.Published = _Published;
		this.Price = _Price;
		this.PublishingRegion = _PublishingRegion;
	}

	public String getEditionTitle() {
		return EditionTitle;
	}

	public void setEditionTitle(String editionTitle) {
		EditionTitle = editionTitle;
	}

	public int getPublished() {
		return Published;
	}

	public void setPublished(int published) {
		Published = published;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getPublishingRegion() {
		return PublishingRegion;
	}

	public void setPublishingRegion(String publishingRegion) {
		PublishingRegion = publishingRegion;
	}

	@Override
	public String toString() {
		return "PrintedEdition [EditionTitle=" + EditionTitle + ", Published="
				+ Published + ", Price=" + Price + ", PublishingRegion="
				+ PublishingRegion + "]";
	}

	
}
