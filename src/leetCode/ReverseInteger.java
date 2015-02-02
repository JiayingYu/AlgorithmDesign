package leetCode;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(789));
		System.out.println(reverse(-123));
		System.out.println(reverse(-2147483648));
	}
	
	public static int reverse(int x) {
		long longX = (long) x;
		long rst = 0;
		long left = 0;
		while (longX != 0) {
			left = longX % 10;
			rst  = rst * 10 + left;
			if (rst > Integer.MAX_VALUE || rst < Integer.MIN_VALUE)
				return 0;
			longX = longX / 10;
		}
		return (int)rst;
	}
}
