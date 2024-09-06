package Bharatgas;

public class putty {

	public static void main(String[] args) {

		
		try {

			 // Replace "path/to/your/batchfile.bat" with the actual path to your batch file

			 Process process = Runtime.getRuntime().exec("cmd /c start C:\\Users\\qq\\Desktop\\open_putty.bat");

			 int exitCode = process.waitFor();

			 System.out.println("Batch file execution completed with exit code: " + exitCode);

			 
			 

			 } catch (Exception e) {


			 System.out.println("EFF");


		
			 
			 
			 
			 }
		
		
		
	}

}
