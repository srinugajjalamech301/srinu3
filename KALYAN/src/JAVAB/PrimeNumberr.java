package JAVAB;

public class PrimeNumberr {

	public static void main(String[] args) {

		
		
		int a=9;
		int count=0;
		
		
		for(int i=1;i<=a;i++)
		{
			
			if(a%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
			System.out.println("given number is prime");
		else
			System.out.println("not a prime");
		
		
		
	}
}
