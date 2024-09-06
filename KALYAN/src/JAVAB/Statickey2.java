package JAVAB;

public class Statickey2 {

	int rollno;
	String name;
	static String collageNmae ;

	public Statickey2(int r, String name) {

		this.rollno = r;
		this.name = name;

	}

	public void display() {

		 collageNmae = "HTP";

		System.out.println("name =" + name + "  Role number =" + rollno + "  collage name =" + collageNmae);
	}

	public void displaycOLLAGE() {

		 collageNmae = "zzzzz";

		System.out.println("name =" + name + "  Role number =" + rollno + "  collage name =" + collageNmae);
	}
	public void displaycOLLAGE2() {


		System.out.println("name =" + name + "  Role number =" + rollno + "  collage name =" + collageNmae);
	}

	public static void main(String[] args) {
	Statickey2 d1 = new Statickey2(22, "kalyan");
		Statickey2 d2 = new Statickey2(55, "virat");

		d1.display();
		
		d2.displaycOLLAGE();
		d2.displaycOLLAGE2();


	}
}
