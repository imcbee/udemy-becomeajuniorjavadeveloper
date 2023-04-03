package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {
//		Read a credit card CSV statement
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\eclipse-workspace\\creditcardstatements.csv";
		String datarow;

//		Creating a balance variable that calculates the running balance of the user’s account
		double creditCardBalance = 0.0;
		double debitBalance = 0.0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			while ((datarow = br.readLine()) != null) {
				String[] line = datarow.split(",");
				data.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		If the field says CREDIT, then add the amount to the balance
//		If the field says DEBIT, then subtract the amount to the balance

		for (String[] entry : data) {
			for (String field : entry) {
				if (field.contains("CREDIT")) {
					creditCardBalance = creditCardBalance + Double.parseDouble(entry[entry.length - 1]);
				} else if (field.contains("DEBIT")) {
					creditCardBalance = creditCardBalance - Double.parseDouble(entry[entry.length - 1]);
				}
			}

		}
		System.out.println(creditCardBalance);
		//System.out.println(debitBalance);


//		If the final amount is greater than zero, charge a 10% fee and warn the user
		if(creditCardBalance < 0) {
			System.out.println("Due to unpaid credit card balance, you are charged and extra 10%: " + (creditCardBalance * 0.10));
		}
//		If the final amount is zero, thank the user for their payments
		if(creditCardBalance == 0) {
			System.out.println("Thank you for your payments.  Your final balance is: " + creditCardBalance);
		}
//		If the final amount is less than zero, thank the user for their payment and display their overpayment.
		else if(creditCardBalance > 0) {
			System.out.println("Thank you for your payments.  You have extra in your balance: " + creditCardBalance);
		}
	}

}
