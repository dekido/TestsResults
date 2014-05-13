import java.util.Scanner;
import java.io.File;
import java.text.DecimalFormat;

// Opens a file of test scores and calls processScores to read and evaluate them.
public class TestResults {
	public final static String filename = "testScores.txt";
	final static int PASSING = 70;
	

	// Driver to open test file and call student-written method to process scores.
	public static void main(String[] args) {
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.println("File could not be opened: " + filename);
			System.exit(0);
		}

		processScores(inputFile);
	}

	// MAKE SURE TO DOCUMENT YOUR METHOD FULLY
	public static void processScores(Scanner file) {
		DecimalFormat df = new DecimalFormat("00.0");	// For outputing test average
		System.out.println("Name           Avg  Pass");
		System.out.println("------------------------");
		int average = 0;
		int numScores = -1;
		
		while(file.hasNext()){
			String name = file.next();
			System.out.println(name);
			int space = 15 - name.length();
			for(int i = 0; i <= space; i++){
				System.out.println(" ");
			while(file.hasNextInt()){
//				Every time you repeat this loop, your sum is going to be zero...
				int sum = 0;
				sum += file.nextInt();
//				you are already checking if there is a next in the while loop...
				if(file.hasNextInt()){
					numScores++;
				}
				System.out.print(sum/numScores);
			}
				
				
			}
			
		}
	}
}

