package files;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and will retrieve a phone number

		// valid phone number : 10 digits long, there is 911, area code cannot start in
		// 0 or 9, there can't be 911

		String filename = "C:\\eclipse-workspace\\PhoneNumber.txt";
		File file = new File(filename);
		String[] phoneNumbers = new String[9];
		String phoneNumber = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < phoneNumbers.length; i++) {
				phoneNumbers[i] = br.readLine();

			}

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Cound not read file");
		}

		// check for valid phone number
		for (int i = 0; i < phoneNumbers.length; i++) {
			phoneNumber = phoneNumbers[i];
			
			try {
				if (phoneNumber.length() != 10) {

					throw new TenDigitException(phoneNumber);
				}
				if (phoneNumber.substring(0, 1).equals("0") || phoneNumber.substring(0, 1).equals("9")) {
					throw new AreaCodeException(phoneNumber);
				}
				for (int j = 0; j < phoneNumber.length() - 2; j++) {
					if (phoneNumber.substring(j, j + 1).equals("9")) {
						if (phoneNumber.substring(j + 1, i + 3).equals("11")) {
							throw new EmergencyException(phoneNumber);
						}
					}
				}
				System.out.println(phoneNumber);
			} catch (TenDigitException e) {
				System.out.println("Error: Phone number is not ten digits");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("Error: Phone number is has invalid area code.");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				System.out.println("Error: Invalid 911 sequence found.");
				System.out.println(e.toString());
			}

		}
	}
}

class TenDigitException extends Exception {
	String num;

	TenDigitException(String num) {
		this.num = num;
	}

	public String toString() {
		return ("TenDigitException: " + num);
	}
}

class AreaCodeException extends Exception {
	String num;

	AreaCodeException(String num) {
		this.num = num;
	}

	public String toString() {
		return ("AreaCodeException: " + num);
	}
}

class EmergencyException extends Exception {
	String num;

	EmergencyException(String num) {
		this.num = num;
	}

	public String toString() {
		return ("EmergencyException: " + num);
	}
}