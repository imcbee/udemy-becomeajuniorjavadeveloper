package basics;

public class Days {

	public static void main(String[] args) {
		// execute different block of code on the value of a condition
		
		String month = "February";
		 
		 switch (month) {
		 case "January" :
		 System.out.println("Today is January");
		 case "February" :
		 System.out.println("Today is February");
		 case "March" :
		 System.out.println("Today is March");
		 break;
		 case "April" :
		 System.out.println("Today is April");
		 break;
		 case "May" :
		 System.out.println("Today is May");
		 break;
		 default : System.out.println("Error!");
		}

	}

}
