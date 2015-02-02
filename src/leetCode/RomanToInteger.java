package leetCode;


public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("IVII"));
	}
	
	public static int romanToInt(String s) {
		if (s == null || s.equals("")) {
			return 0;
		}

		int length = s.length();
		int prev = 0;
		int sum = 0;
		int cur = 0;

		for (int i = length - 1; i >= 0; i--) {
			cur = romanToInt(s.charAt(i));
			if (i == length - 1) {
				sum += cur;
			} else {
				if (cur >= prev) {
					sum += cur;
				} else {
					sum -= cur;
				}
			}
			prev = cur;
		}
		return sum;
	}

	private static int romanToInt(char c) {
		int num = 0;
		switch (c) {
		case 'I':
			num = 1;
			break;

		case 'V':
			num = 5;
			break;

		case 'X':
			num = 10;
			break;

		case 'L':
			num = 50;
			break;

		case 'C':
			num = 100;
			break;

		case 'D':
			num = 500;
			break;

		case 'M':
			num = 1000;
			break;

		default:
			num = 0;
			break;
		}

		return num;
	}
}
