package by.epam.les09.main;

public class Main {

	public static void main(String[] args) {
		PrintedEdition pe = new PrintedEdition("Murzilka", 2015, 50, "Piter");
		Book b = new Book("How to build ship", 2016, 120, "Minsk", "Technical",
				"18+");
		Magazine m = new Magazine("Play Mouse", 2017, 5, "Minsk", "For Fun",
				"21+", "Y");
		Newspaper n = new Newspaper("Village Business News", 2018, 1,
				"Uriupinsk", "Economic", "3+", "Y", "Yep!)");

		System.out.println(pe.toString());
		System.out.println("-----------");
		System.out.println("Edition Title: " + b.getEditionTitle()
				+ " | Published: " + b.getPublished() + " | Price: "
				+ b.getPrice() + " | PublishingRegion: "
				+ b.getPublishingRegion() + " | Specialization: "
				+ b.getSpecialization() + " | AgeCategoty: "
				+ b.getAgeCategoty());
		System.out.println(b.toString());
		System.out.println();
		System.out.println("Edition Title: " + m.getEditionTitle()
				+ " | Published: " + m.getPublished() + " | Price: "
				+ m.getPrice() + " | PublishingRegion: "
				+ m.getPublishingRegion() + " | Specialization: "
				+ m.getSpecialization() + " | AgeCategoty: "
				+ m.getAgeCategoty() + " | isPeriodical: "
				+ m.getisPeriodical());
		System.out.println(m.toString());
		System.out.println();
		System.out.println("Edition Title: " + n.getEditionTitle()
				+ " | Published: " + n.getPublished() + " | Price: "
				+ n.getPrice() + " | PublishingRegion: "
				+ n.getPublishingRegion() + " | Specialization: "
				+ n.getSpecialization() + " | AgeCategoty: "
				+ n.getAgeCategoty() + " | isPeriodical: "
				+ n.getisPeriodical() + " |is it convinient to use in toilet: "
				+ n.getisConvinientForToilet());
		System.out.println(n.toString());

	}
}
