import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class UserStrings {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String sentinel = "DONE";
		String fileName = "userStrings.txt";

		// Create objects of the classes needed to write text files
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		// Read user strings and print to output file while string != sentinel value
		System.out.println("Enter a string. Enter \"DONE\" if finished: ");
		System.out.print("First string: ");
		String userString = scan.nextLine();
		while (sentinel.compareTo(userString) != 0) {
			outFile.print(userString);
			outFile.println();
			System.out.print("NextString: ");
			userString = scan.nextLine();
		}
		outFile.close();
		scan.close();

	}

}
