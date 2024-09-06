
public class RevereseString {

	public static void main(String[] args) {
		String name = "Subbu is very Talented and probelem";

		System.out.println(reverse(name));

	}

	static String reverse(String n) {
// To create new length
		char[] sing = new char[n.length()];
		int len = 0;

		for (int i = n.length() - 1; i >= 0; i--) {

			sing[len] = n.charAt(i);
			len++;

		}

		String reverse = "";
		for (int i = 0; i < n.length(); i++) {
			reverse = reverse + sing[i];

		}

		return reverse;

	}

}
