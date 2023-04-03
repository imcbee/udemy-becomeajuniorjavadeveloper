package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};
		
		for (int i = 0; i< alphabet.length;i++) {
			System.out.print(alphabet[i]);
		}
		
		for(String letter: alphabet) {
			System.out.print("\n" + letter + " ");
		}
		
		String[][] users = {
				{"John", "Williams", "jw@test.com", "2349843456"},
				{"Sarah", "Jackson", "sj@test.com", "5849368234"},
				{"Rachel", "Wallace", "rw@test.com", "4584898596"}
		};
		
		// Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println(numOfUsers);
		System.out.println(numOfFields);
		
		for(int i = 0; i<numOfUsers; i++) {
			for(int j =0; j<numOfFields; j++) {
				System.out.println(users[i][j]);
			}
		}
		
		for(int i = 0; i<numOfUsers; i++) {
				String firstName = users[i][0];
				String lastName = users[i][1];
				String email = users[i][2];
				String phone = users[i][3];
				System.out.println(firstName + " " + lastName + " " + email + " " + phone);
		}
		
		for(String[] user : users) {
			for(String field: user) {
				System.out.print(field + " ");
			}
		}

	}

}
