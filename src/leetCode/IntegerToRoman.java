package leetCode;
public class IntegerToRoman {
	public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
				"V", "IV", "I" };
		int i = 0;
		while (i < nums.length) {
			if (num >= nums[i]) {
				sb.append(romans[i]);
				num -= nums[i];
			} else {
				i++;
			}
		}
		return sb.toString();
	}
}
