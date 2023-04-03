package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// this method will read data from a csv file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\eclipse-workspace\\accounts.csv";
		String datarow;

		try {
			// open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));

			// read the data as long as it's not empty
			while ((datarow = br.readLine()) != null) {
				// parse the data by commas
				String[] line = datarow.split(",");
				data.add(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String[] account : data) {
			System.out.print("[ ");
			for (String field : account) {
				System.out.print(field + " ");
			}
			System.out.print(" ] \n");
		}

	}

}
