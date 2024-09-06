package JAVAB;

public class CountOfPromeNumber {
public static void main(String[] args) {
		int a=1;
		int b=100;
		int total=0;
		for(int i=a;i<=b;i++)
		{
			int count=0;
			for(int k=1;k<=i;k++)
			{
				if(i%k==0)
					count++;				
			}
			if(count==2)
			{
				System.out.println(i);
				total++;
			}
		}
		System.out.println(total);
	}

}
