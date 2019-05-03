
abstract public class Account {
	int Account_Number = 0;
	String name;
	double Amount;
	int min_balance =1000;

	public Account(String name, double amount) {
		Account_Number += Account_Number;
		this.name = name;
		Amount = amount;
		System.out.println("Hello " + name + " Welcome to banking with our bank. Your Account number is " + Account_Number
				+ " Your balance is " + amount + " Account type is : " + this.getClass().getName());
	}
	abstract double deposit(double amount);
	abstract double withdrawal(double amount);
	

}
