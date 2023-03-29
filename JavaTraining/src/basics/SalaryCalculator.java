package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// variable to define career
		//compute our annual salary
		//rate * hoursperweek * weekperyear
		
		// variable to define career
		String career;
		System.out.println("Program is starting");
		
		career = "Software Developer";
		
		System.out.println("My career: " + career);

		//compute our annual salary
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		//career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $ " + rate + " is $ " + salary + " per year.");
	}

}
