package by.epam.les06.main;

public class MainClass {

	public static void main(String[] args) {
		Student st1 = new Student("Axel", "Rose", 3);
		Student st2 = new Student("Tina", "Turner", 3);
		Student st3 = new Student("Jon", "Bon Jovi", 3);
		Student st4 = new Student("Vasya", "Pupkin", 3);
		Student st5 = new Student("Mary", "Superstar", 3);

		st1.setMark(5);
		st1.setMark(5);
		st1.setMark(5);

		st2.setMark(2);
		st2.setMark(2);
		st2.setMark(2);

		st3.setMark(5);
		st3.setMark(5);
		st3.setMark(5);

		st4.setMark(2);
		st4.setMark(2);
		st4.setMark(2);

		st5.setMark(4);
		st5.setMark(5);
		st5.setMark(2);

		Group gr1 = new Group(4);

		gr1.add(st1);
		gr1.add(st2);
		gr1.add(st3);

		Group gr2 = new Group(4);

		gr2.add(st4);
		gr2.add(st5);

		System.out.println("-------------------------------");
		System.out.println("*****Students quantity*****");
		System.out.println("-------------------------------");
		System.out.println("Students quantity in Group #1: " + gr1.getCountOfStudents());
		System.out.println("Students quantity in Group #2: " + gr2.getCountOfStudents());
		System.out.println();
		System.out.println("-------------------------------");

		GroupLogic Grl = new GroupLogic();

		System.out.println("*****Groups average mark*****");
		System.out.println("-------------------------------");
		System.out.printf("Group #1 average mark is: " + "%.1f", Grl.getAvrMark(gr1));
		System.out.println();
		System.out.printf("Group #2 average mark is: " + "%.1f", Grl.getAvrMark(gr2));
		System.out.println();
		System.out.println("-------------------------------");

		StudentLogic Stl = new StudentLogic();

		System.out.println("*****Each student average mark*****");
		System.out.println("-------------------------------");
		System.out.printf(st1.getName() + " " + st1.getSurname() + " Average mark is: " + "%.1f", Stl.getAvrMark(st1));
		System.out.println();
		System.out.printf(st2.getName() + " " + st2.getSurname() + " Average mark is: " + "%.1f", Stl.getAvrMark(st2));
		System.out.println();
		System.out.printf(st3.getName() + " " + st3.getSurname() + " Average mark is: " + "%.1f", Stl.getAvrMark(st3));
		System.out.println();
		System.out.printf(st4.getName() + " " + st4.getSurname() + " Average mark is: " + "%.1f", Stl.getAvrMark(st4));
		System.out.println();
		System.out.printf(st5.getName() + " " + st5.getSurname() + " Average mark is: " + "%.1f", Stl.getAvrMark(st5));
		System.out.println();
		System.out.println("-------------------------------");

		System.out.println("*****ASudents & BSudents in each group*****");
		System.out.println("-------------------------------");
		System.out.println("Group #1 AStudents count: " + Grl.getCountAStudent(gr1));
		System.out.println("Group #1 BStudents count: " + Grl.getCountBStudent(gr1));
		System.out.println("Group #2 AStudents count: " + Grl.getCountAStudent(gr2));
		System.out.println("Group #2 BStudents count: " + Grl.getCountBStudent(gr2));
		System.out.println();
		System.out.println("-------------------------------");

		int ASt = Grl.getCountAStudent(gr1) + Grl.getCountAStudent(gr2);
		int BSt = Grl.getCountBStudent(gr1) + Grl.getCountBStudent(gr2);

		System.out.println("*****Total count of ASudents & BSudents*****");
		System.out.println("-------------------------------");
		System.out.println("Total AStudents count: " + ASt);
		System.out.println("Total BStudents count: " + BSt);

	}

}
