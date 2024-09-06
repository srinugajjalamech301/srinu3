package JAVAB;

public class Statickey {

	int rollno;
	String name;
	static String collageNmae = "SVC";

	public Statickey(int r, String name) {

		this.rollno = rollno;
		this.name = name;

	}

	public void display() {

		String collageNmae = "HTP";

		System.out.println("name =" + name + "  Role number =" + rollno + "  collage name =" + collageNmae);
	}

	public void displaycOLLAGE() {

		// String collageNmae

		System.out.println("name =" + name + "  Role number =" + rollno + "  collage name =" + collageNmae);
	}

	public static void main(String[] args) {
		Statickey d1 = new Statickey(22, "kalyan");
		Statickey d2 = new Statickey(55, "virat");

		d1.display();
		d2.display();
		d2.displaycOLLAGE();

	}
}
