package sourceCode;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		String[] strs = s.split("\\s+");

		int size = strs.length;
		if (size == 0) {
			return 0;
		}
		int len = strs[size - 1].length();
		return len;
	}
}
