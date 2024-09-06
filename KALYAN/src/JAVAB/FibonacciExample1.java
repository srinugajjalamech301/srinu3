package JAVAB;

public class FibonacciExample1 {

	public static void main(String[] args) {
		
//0 1 1 2 3 5 8 12 20 32 
	int a=0;
	int b=1;
int c;
System.out.print(a+" "+b);
for(int i=0;i<=10;i++)
	{
	 c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
			
	}
	
			
	}

}
