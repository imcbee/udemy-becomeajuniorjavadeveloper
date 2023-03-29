package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment3 {

	public static void main(String[] args) {
		String filename = "C:\\eclipse-workspace\\passwords.txt";
		File file = new File(filename);

		String[] passwords = new String[12];

		// Read the file
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Check for valid passwords
		for (int j = 0; j < passwords.length; j++) {
			String password = passwords[j];
			System.out.println("----------------------------------\n" + password);
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasCharacter = false;

			for (int i = 0; i < password.length(); i++) {

				if ("0123456789".contains(password.substring(i, i + 1))) {
					hasNumber = true;

				} else if ("abcdefghijklmnopqrstuvwxyz".contains(password.toLowerCase().substring(i, i + 1))) {
					hasLetter = true;

				} else if ("!@#$%^&*()-_+=".contains(password.substring(i, i + 1))) {
					hasCharacter = true;

				} else {
					try {
						throw new InvalidCharacterException(password.substring(i, i + 1));
					} catch (InvalidCharacterException e) {
						System.out.println("This is an invalid password.");
						System.out.println(e.toString());
					}
				}
			}

			try {
				if (!hasNumber) {
					throw new NonNumberException(password);
				} else if (!hasLetter) {
					throw new NonLetterException(password);
				} else if (!hasCharacter) {
					throw new NonCharacterException(password);
				}
			} catch (NonNumberException | NonLetterException | NonCharacterException e) {
				System.out.println("This is an invalid password.");
				System.out.println(e.toString());
			}
		}
	}
}

class NonNumberException extends Exception {
	String ch;

	NonNumberException(String ch) {
		this.ch = ch;
	}

	public String toString() {
		return ("NonNumberException: " + ch);
	}
}

class NonLetterException extends Exception {
	String ch;

	NonLetterException(String ch) {
		this.ch = ch;
	}

	public String toString() {
		return ("NonLetterException: " + ch);
	}
}

class NonCharacterException extends Exception {
	String ch;

	NonCharacterException(String ch) {
		this.ch = ch;
	}

	public String toString() {
		return ("NonCharacterException: " + ch);
	}
}

class InvalidCharacterException extends Exception {
	String ch;

	InvalidCharacterException(String ch) {
		this.ch = ch;
	}

	public String toString() {
		return ("InvalidCharacterException: " + ch);
	}
}
