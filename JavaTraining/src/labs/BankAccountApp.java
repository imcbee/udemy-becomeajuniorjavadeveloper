package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874", 10000);
		BankAccount acc2 = new BankAccount("234567238", 2000);
		BankAccount acc3 = new BankAccount("568345676", 2500);

		acc1.setName("jim");
		System.out.println(acc1.getName());
		acc1.makleDeposit(500);
		acc1.makleDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	private static int ID = 1000;
	private String accountNumber; // id + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;

	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your account created: " + accountNumber);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void payBill(double amount) {
		System.out.println("Paying bill.");
		balance = balance - amount;

	}

	public void makleDeposit(double amount) {
		System.out.println("Making deposit.");
		balance = balance + amount;
	}

	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", SSN=" + SSN + ", balance="
				+ balance + "]";
	}
	
	
}