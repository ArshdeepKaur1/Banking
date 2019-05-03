class Insufficient_funds extends Exception{
	private String e;
	
	Insufficient_funds(String error){
		e = error;
	}
	public String toString() {
		return e;
	}
}


public final class SB_Account extends Account{
double Min_balance =1000;
	final int interest=4;
	public SB_Account(String name, double amount) {
		super(name, amount);
		
		// TODO Auto-generated constructor stub
	}
	double deposit(double amount) {
		super.Amount = super.Amount + amount;
		return super.Amount;
	}

 double withdrawal (double amount) {
		try {
			double amt = super.Amount - amount;
			if (amt < Min_balance)
			{throw new Insufficient_funds("FUNDS NOT SUFFICIENT");
			
			}
			super.Amount = amt;
			}
		catch (Insufficient_funds err) {
			System.out.print(err);
		}
	finally
	{return super.Amount;
	}
}
}