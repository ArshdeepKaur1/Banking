import java.util.Scanner;

public class Driver_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		System.out.println("Enter customer's name");
		String name = sc.nextLine();
		System.out.println("Enter s for saving account and c for current account");
		char type = sc.next().charAt(0);
		switch (type) {
		case 's': {
			System.out.println("Enter amount with which the account is to be started");
			double amount = sc.nextDouble();
			acc = new SB_Account(name, amount);
			}
			break;
			
		case 'c': {
			System.out.println("Enter amount with which the account is to be started");
			double amount = sc.nextDouble();
			acc = new CurrentAccount(name, amount);
		 }
		break;
		}
		System.out.println("Enter w for withdrawal and d for deposit");
		char op = sc.next().charAt(0);
		switch (op) {
		case 'w': {
			System.out.println("Enter amount to be withdrawn");
			double amt = sc.nextDouble();
			double Balance = acc.withdrawal(amt);
		}
		break;
		
		case 'd': {System.out.println("Enter amount to be deposited");
		double amt = sc.nextDouble();
		double Balance = acc.deposit(amt);
		}
		break;
	}
	System.out.println("Current balance is:"+acc.Amount);
	}
}
