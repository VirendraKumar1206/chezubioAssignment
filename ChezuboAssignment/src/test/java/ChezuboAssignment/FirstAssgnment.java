package ChezuboAssignment;

public class FirstAssgnment {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3 };
		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {

			if (digits[i] < 9) {
				digits[i]++;
				break;
			}

			digits[i] = 0;
		}

		if (digits[0] == 0) {

			int[] newNumber = new int[n + 1];

			newNumber[0] = 1;

			for (int digit : newNumber) {
				System.out.print(digit + " ");
			}
		} else {

			for (int digit : digits) {
				System.out.print(digit + " ");
			}
		}
	}
}
