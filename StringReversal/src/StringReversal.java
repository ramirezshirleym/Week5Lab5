import java.util.Scanner;

public class StringReversal {
	public static String reverseString(String s) {
		// base case is an empty string
		if (s.length() == 0) {
			return s;
		}
		
		int index = s.length() - 1;
		String lastChar = s.substring(index);
		String remaining = s.substring(0, index);
		return lastChar + reverseString(remaining);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = scan.nextLine();

		System.out.println(reverseString(s));

		scan.close();
	}

}
