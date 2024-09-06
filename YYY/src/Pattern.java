
public class Pattern {

	
	public static void main(String[] args) {
		System.out.println();
		int count =5;
		
		 patten(count);
		
	}

	private static void patten(int cou) {
	
		
		/*
		 * 
		 **
		 ***
		 **
		 */
		
		
		
		for (int i=1;i<=cou;i++) {
			
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();	
			
		}
		
		for (int i=cou-1;i>0;i--) {
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
	}
	
}
