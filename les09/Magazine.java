package by.epam.les09.main;

public class Magazine extends Book {
	private String isPeriodical;

	public Magazine(String _EditionTitle, int _Published, int _Price,
			String _PublishingRegion, String _Specialization, String _AgeCategoty, String _isPeriodical) {
		super(_EditionTitle, _Published, _Price, _PublishingRegion,
				_Specialization, _AgeCategoty);
		this.isPeriodical = _isPeriodical;
	}
	
	public String getisPeriodical(){
		return isPeriodical;
	}

	@Override
	public String toString() {
		return "Magazine [isPeriodical=" + isPeriodical + "]";
	}
	
	
}
