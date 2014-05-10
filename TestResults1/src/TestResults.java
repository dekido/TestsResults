import java.util.Scanner;
import java.io.File;
import java.text.DecimalFormat;

// Opens a file of test scores and calls processScores to read and evaluate them.
public class TestResults {
	public final static String filename = "testScores.txt";

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

		while(file.hasNextLine()){
		}
	}
}

