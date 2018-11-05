package by.epam.les09.main;

public class Book extends PrintedEdition {
	private String Specialization;
	private String AgeCategoty;

	public Book(String _EditionTitle, int _Published, int _Price,
			String _PublishingRegion, String _Specialization, String _AgeCategoty) {
		super(_EditionTitle, _Published, _Price, _PublishingRegion);
        this.Specialization = _Specialization;
        this.AgeCategoty = _AgeCategoty;
	}
    public String getSpecialization(){
    	return Specialization;
    } 
    
    public String getAgeCategoty(){
    	return AgeCategoty;
    }
	@Override
	public String toString() {
		return "Book [Specialization=" + Specialization + ", AgeCategoty="
				+ AgeCategoty + "]";
	}
    
    
}
