package JAVAB;
public class PalindromeNumber {
	public static void main(String[] args) {
		int number=121;
		int sum=0;
		int rev=0;
		int temp=number;
		while(number>0)
		{
				rev=number%10; //1 2
			sum=sum*10+rev;//1 /12 121
			number=number/10;//12 1 0
					}
					if(temp==sum)
		{
			System.out.println("number");
		}
			}

}
