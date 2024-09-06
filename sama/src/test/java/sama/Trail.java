package sama;

public class Trail {

	static int a , b;
	
	public static void main(String[] args) {
		
		 a =20;
		 b =55;
		
		System.out.println("a value before "+  a);
	       System.out.println("b value before " +b);	
	       
		
	      firstMethod();
	      // secondMethod();
		
		System.out.println("a value after "+  a);
       System.out.println("b value after " +b);	
       
       
	}



           private static void firstMethod() {
        		

        		a=a+b;
        		b=a-b;
        		a=a-b;
}
        
           
           
           
           private static void secondMethod() {
       		int c;
       		
       		c=b;
       		b=a;
       		a=c;
       		
       		
}
}
