package by.epam.les09.main;

public class Newspaper extends Magazine {
	private String isConvinientForToilet;

	public Newspaper(String _EditionTitle, int _Published, int _Price,
			String _PublishingRegion, String _Specialization,
			String _AgeCategoty, String _isPeriodical,
			String _isConvinientForToilet) {
		super(_EditionTitle, _Published, _Price, _PublishingRegion,
				_Specialization, _AgeCategoty, _isPeriodical);
		this.isConvinientForToilet = _isConvinientForToilet;
	}
	
	public String getisConvinientForToilet(){
		return isConvinientForToilet;
	}

	@Override
	public String toString() {
		return "Newspaper [isConvinientForToilet=" + isConvinientForToilet
				+ "]";
	}
	
	

}
