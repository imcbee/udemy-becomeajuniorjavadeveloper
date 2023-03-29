package exceptions;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		
		double payment = 0;
		boolean postivePayment = true;
		
		
		// 2. get the amount and test the value
		Scanner scan = new Scanner(System.in);
		
		do {
			// 1. ask user for input
			System.out.print("Enter the payment amount: ");
			
			// 3.  handle exceptions appropriately
			try {
				payment = scan.nextDouble();
				if(payment < 0) {
					throw new NegativePaymentException(payment);
				}else {
					postivePayment = true;
				}
			
			} catch(NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again...");
				postivePayment = false;
			}
			
		}while(!postivePayment);
		
		// 4. print confirmation
		System.out.println("Thank you for your payment of $ " + payment);

		scan.close();
	}

}
