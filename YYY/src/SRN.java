
public class SRN {
	public static void main(String args[]) {
		// System.out.println("Hi ");
		prime();
	}

	static void prime() {

		{
			int i = 0;
			int num = 0;
			// Empty String
			String primeNumbers = "";

			for (i = 1; i <= 200; i++) {
				int counter = 0;
				for (num = i; num >= 1; num--) {
					if (i % num == 0) {
						counter = counter + 1;
					}
				}
				if (counter == 2) {
					// Appended the Prime number to the String
					primeNumbers = primeNumbers + i + " ";
				}
			}
			System.out.println("Prime numbers from 1 to 200 are :");
			System.out.println(primeNumbers);
		}

	}

}
