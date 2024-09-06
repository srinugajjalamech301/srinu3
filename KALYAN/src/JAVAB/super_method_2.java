package JAVAB;

public class super_method_2 extends super_method{

	
	void  add()
	{
		System.out.println("this is child class method");
	}
	void sample()
	{
		System.out.println("this is chield class saple");
	}
	
	void display()
	{
		super.add();
		sample();
	}
}
