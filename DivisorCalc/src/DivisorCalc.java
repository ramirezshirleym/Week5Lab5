import java.util.Scanner;

public class DivisorCalc {

	public static int gcd(int num1, int num2) {

		// Ensure num1 is always greater than num2
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		// If num2 divides num1 without remainder, gcd = num2
		if (num1 % num2 == 0) {
			return num2;
		}

		// Else get the remainder of num1/num2
		int remainder = num1 % num2;

		// Recurse with num2 and remainder
		return gcd(num2, remainder);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1, num2;

		System.out.println("Enter two integers: ");
		System.out.print("num1: ");
		num1 = scan.nextInt();
		System.out.print("num2: ");
		num2 = scan.nextInt();

		System.out.println("gcd: " + gcd(num1, num2));

		scan.close();
	}
}
