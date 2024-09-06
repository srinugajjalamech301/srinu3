
public class SwapNumbers {
public static void main(String[] args) {
	
	int a= 25 ,b=35;
	swap1(a,b);
}


static void swap1(int num1, int num2) {
	
	int num3=num1;
	num1=num2;
	num2=num3;
	
	System.out.println("A value -- >"+num1+"B value -- >" + num2);
}

}
