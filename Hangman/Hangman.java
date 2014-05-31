import java.util.Scanner;
public class Hangman{
	
    public Hangman(Scanner file) {
        // Store the file object in an instance variable for later use
    	
    }

    public void displayGameIntro() {
        // Output the introduction
        System.out.println("Welcome to the hangperson game ...");
        System.out.println("To play, guess a letter to try to guess the word.");
        System.out.println("Every time you choose an incorrect letter another");
        System.out.println("body part appears on the gallows. If you guess the");
        System.out.println("word before you're hung, you win :-)");
        System.out.println("If you get hung you lose :-(");
        System.out.println();
        System.out.println("Time to guess ...");
       
    }

    public void play () {
    	int right = 0;
    	int wrong = 0;
    	boolean [] guess = new boolean [26];
        char [][] hanger = {{'|','-','-','-','-','-','|','-'},
        					{'|',' ',' ',' ',' ',' ',' ',' '},
        					{'|',' ',' ',' ',' ',' ',' ',' '},
        					{'|',' ',' ',' ',' ',' ',' ',' '},
        					{'|',' ',' ',' ',' ',' ',' ',' '},
        					{'|','_','_','_','_','_','_','_','_','_','_'}};
    while(right<wrong)
        for(char[] i:hanger){
        	for(char j: i){
        		System.out.print(j);
        	}
        	System.out.println();
        }
        System.out.println("Letters guessed already =>" );
        System.out.println("Number of wrong guesses =>" + wrong);
        System.out.println("The word so far =>" + )
    }

}