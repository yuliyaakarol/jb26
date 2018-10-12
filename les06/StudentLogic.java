package by.epam.les06.main;

public class StudentLogic {

	public double getAvrMark(Student st) {
		double avr = 0;

		for (double d : st.getMarks()) {
			avr = avr + d;
		}

		avr = avr / st.getCountOfMarks();

		return avr;
	}

}