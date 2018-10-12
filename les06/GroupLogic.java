package by.epam.les06.main;

public class GroupLogic {

	private final StudentLogic stLogic = new StudentLogic();

	private static final double MAX_MARK = 5.0;

	private static final double MIN_MARK = 2.0;

	public double getAvrMark(Group gr) {
		double avr = 0;

		for (Student st : gr.getStudents()) {
			if (st != null) {
				avr = avr + stLogic.getAvrMark(st);
			}
		}

		avr = avr / gr.getCountOfStudents();

		return avr;
	}

	public int getCountAStudent(Group gr) {
		int countA = 0;

		for (Student st : gr.getStudents()) {
			if (st == null) {
				return countA;
			}

			if (stLogic.getAvrMark(st) >= MAX_MARK) {
				countA++;

			}
		}

		return countA;
	}

	public int getCountBStudent(Group gr) {
		int countB = 0;

		for (Student st : gr.getStudents()) {
			if (st == null) {
				return countB;
			}

			if (stLogic.getAvrMark(st) <= MIN_MARK) {
				countB++;
			}
		}

		return countB;
	}

}