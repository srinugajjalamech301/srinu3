package JAVAB;

public class primeNumber {

	public static void main(String[] args) {
//2,3.5,7,11,13,17,19
		//int b=13;
		int count=0 ;
		int prime;
		for(int b=1;b<=100;b++)
		{
		for(int i=1;i<=b;i++)
		{
			
			if(b%i==0)
			//	System.out.println(b);
				count++;
			}
		}
		if(count==2)
		{
			//System.out.println(b);
			System.out.println("itsprime");
				}
	//	System.out.println(b);	
		
	}

}
