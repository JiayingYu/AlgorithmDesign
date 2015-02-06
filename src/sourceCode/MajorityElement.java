package sourceCode;
import java.util.HashMap;

public class MajorityElement {
	public static int majorityElement(int[] num) {
		int size = num.length;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (hash.containsKey(num[i])) {
				int counter = hash.get(num[i]) + 1;
				if (counter > size / 2)
					return num[i];
				hash.put(num[i], counter);
			} else {
				if (1 > size / 2)
					return num[i];
				hash.put(num[i], 1);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {233, 566, 2, 9, 12, 12, 12, 12, 12};
		System.out.println(majorityElement(nums));
	}
}
