
public class ReverseNumber {
	public static void main(String[] args) {
		reverse3();
	}

	static void reverse() {

		int num = 87564;

		StringBuffer hh = new StringBuffer(String.valueOf(num));
		// StringBuffer hh=new StringBuffer(num);
		StringBuffer rev = hh.reverse();
		System.out.println(rev);
	}

	static void reverse1() {

		int num = 87564;

		StringBuilder kk = new StringBuilder();
		kk.append(num);
		StringBuilder rev = kk.reverse();

		System.out.println(rev);
	}

	static void reverse3() {

		int num = 87564;

		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.print(rev);
	}

}
