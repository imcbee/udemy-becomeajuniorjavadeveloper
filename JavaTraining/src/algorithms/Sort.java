package algorithms;

public class Sort {

	public static void bubbleSort(int[] dataset) {
		boolean swapped;

		System.out.println("\nOriginal array: \n");
		printArr(dataset);
		do {
			swapped = false;
			for (int i = 0; i < dataset.length - 1; i++) {
				if (dataset[i] > dataset[i + 1]) {
					int temp = dataset[i];
					dataset[i] = dataset[i + 1];
					dataset[i + 1] = temp;
					printArr(dataset);
					swapped = true;
				}
			}
		} while (swapped);

	}

	public static void printArr(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
