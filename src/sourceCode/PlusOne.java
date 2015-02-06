package sourceCode;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int pos = digits.length - 1;
		boolean carry = true;

		while (carry && pos >= 0) {
			digits[pos] += 1;

			if (digits[pos] < 10) {
				carry = false;
			} else {
				digits[pos] -= 10;
				pos--;
			}
		}

		if (carry) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for (int i = 1; i < newDigits.length; i++) {
				newDigits[i] = digits[i - 1];
			}
			return newDigits;
		}

		return digits;
	}
}
