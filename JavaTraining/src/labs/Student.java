package labs;

public class Student {
	private static final int ID = 1000;
	private String name;
	private String SSN;
	private String email;
	private double balance;
	private String phone;
	private String city;
	private String state;
	
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		this.email = name + "@email.com";
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getId() {
		return ID;
	}
	
	public String setID() {
		int random = (int) Math.random() * 10000;
		if (random <= 1000) {
			random = random + 1000;
		}
		
		return ID + random + SSN.substring(5, 8);
	}
	
	public void enroll() {
		System.out.println("You have enrolled into a class");
	}
	public void pay(double amount) {
		this.balance = balance - amount;
	}
	public String checkBalance() {
		return "You current balance is: " + balance;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", SSN=" + SSN + ", email=" + email + ", balance=" + balance + "]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	
}
