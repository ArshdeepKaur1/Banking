
class InsufficentFunds extends Exception {
	private String err;

	InsufficentFunds(String error) {
		err = error;
	}

	@Override
	public String toString() {
		return err;
	}
}

public final class CurrentAccount extends Account {
	double min_balance = 5000;

	public CurrentAccount(String name, double xyz) {
		super(name, xyz);

	}

	double deposit(double amount) {
		super.Amount = amount + super.Amount;
		return super.Amount;
	}

	double withdrawal(double amount) {
		try {
			double amt = super.Amount - amount;
			if (amt <= min_balance) {
				throw new InsufficentFunds("FUNDS NOT SUFFICENT");
			}
			super.Amount = amt;

		} catch (InsufficentFunds e) {
			System.out.print(e);
		} finally {
			return super.Amount;
		}
	}

}
