package by.epam.les08.main;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Make Nikols", 780000000, 530, "USD");
		BankAccount ba2 = new BankAccount("Helen Carter", 780000000, 800, "USD");
		BankAccount ba3 = new BankAccount("Jane Stone", 780000000, 350, "USD");
		BankAccount ba4 = new BankAccount("John Berkovich", 780000000, 1200, "USD");
		
		Payment pay1 = new Payment("Mobile Phone", 120);
		Payment pay2 = new Payment("Carpet", 185);
		String cur = ba1.getAccountCurrensy();

		System.out.println("Accounts: ");
		System.out.println(ba1.toString());
		System.out.println(ba2.toString());
		System.out.println(ba3.toString());
		System.out.println(ba4.toString());
		System.out.println();
				
		System.out.println("Goods list with price: ");
		System.out.println(pay1.toString());
		System.out.println(pay2.toString());
		System.out.println();
		
		System.out.println("Account balance after payment: ");
		System.out.println(ba1.getClientName()+" "+(ba1.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
		System.out.println(ba2.getClientName()+" "+(ba2.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
		System.out.println(ba3.getClientName()+" "+(ba3.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
		System.out.println(ba4.getClientName()+" "+(ba4.getAccountAmount() - pay1.getPrice() - pay2.getPrice())+" "+cur);
		
	}

}
