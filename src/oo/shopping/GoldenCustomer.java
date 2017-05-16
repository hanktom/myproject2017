package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	float returnRate = 0.05f;

	public GoldenCustomer(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount + "\t" + (amount*discount) + "\t" +
				(amount*returnRate));
	}

	
}
