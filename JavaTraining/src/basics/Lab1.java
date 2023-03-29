package basics;

public class Lab1 {

	public static void main(String[] args) {
		
		System.out.println(sum(10));
		
		System.out.println(factorial(1)); //1
		System.out.println(factorial(2)); //2
		System.out.println(factorial(3)); //6
		System.out.println(factorial(4)); //24
		System.out.println(factorial(5)); //120
		System.out.println(factorial(6)); //720

		int[] array = {5,3,4,2,12,6,3,234};
		
		System.out.println(minMaxAvg("max", array));
	}
	public static int sum(int n) {
		int total = 0;
		
		for(int i =0; i<= n; i++ ) {
			total = total + i;
		}
		
		return total;
	}
	
	
	
	public static int factorial(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		}
		return num * factorial(num-1);
	}
	
	public static int minMaxAvg(String input, int[] arr) {
		
		switch(input.toLowerCase()) {
			case "max":
				int max = 0;
				for(int i = 0; i < arr.length; i++) {
					if (arr[i] > arr[0]) {
						max = arr[i];
					}
				}
				return max;
		case "min":
				int min = 0;
				for(int i = 0; i < arr.length; i++) {
					if (arr[i] < arr[0]) {
						min = arr[i];
					}
				}
				return min;
		case "avg":
				int total = 0;
				for(int i =0; i < arr.length; i++) {
					total += arr[i];
				}
				return total;
		default:
				System.out.println("Cannot do this operation");
				break;
		
		}
		return 0;
	}
}
