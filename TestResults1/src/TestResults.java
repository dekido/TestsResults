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
//		you want to average each score, so you only reset average after each name...
//		also for average, you need a decimal right? so instead of an int...
		int average = 0;
//		same as "average", you need to reset it every time you have a new name... also, why -1? shouldn't it be 0?
		int numScores = -1;
		
		while(file.hasNext()){
			String name = file.next();
//			careful with println, should be print
			System.out.println(name);
			int space = 15 - name.length();
//			I tested this, you will get ONE extra space... can you see why?
			for(int i = 0; i <= space; i++){
				System.out.println(" ");
//				I added this for you, you did not close you curly brace
			}
			while(file.hasNextInt()){
//				Every time you repeat this loop, your sum is going to be zero..., you only want to reset whenever
//				you get to a new student, also you got to have a decimal for the average, for whatever reason this needs to
//				be a double
				int sum = 0;
				sum += file.nextInt();
//				you are already checking if there is a next in the while loop...
				if(file.hasNextInt()){
					numScores++;
				}
//				do you want to print after every integer is read? also sum/numScores=average right?
				System.out.print(sum/numScores);
			}
//				you still have to determine pass/fail
				
			}
			
		}
	}
}

