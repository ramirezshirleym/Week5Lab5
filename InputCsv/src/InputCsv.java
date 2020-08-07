import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class InputCsv {

	public static void main(String[] args) throws IOException {
		Scanner fileScan;
		String csv;
		String[] csvStrArray;
		int row = 1;

		fileScan = new Scanner(new File("input.csv"));

		System.out.println("Maximum values");

		// Read and process each line of the file
		while (fileScan.hasNext()) {

			// Read in line of csv file
			csv = fileScan.nextLine();

			// Split string around comma delimiter & enter each value into String array
			csvStrArray = csv.split(",");

			int length = csvStrArray.length;

			int[] csvIntArray = new int[length];

			// Create integer array using String array
			for (int index = 0; index < length; index++) {
				csvIntArray[index] = Integer.parseInt(csvStrArray[index]);
			}

			// Sort integer array
			Arrays.sort(csvIntArray);

			// Get max value in integer array
			int max = csvIntArray[length - 1];

			System.out.println("ROW " + row + ": " + max);
			row++;

		}
		fileScan.close();
	}

}
