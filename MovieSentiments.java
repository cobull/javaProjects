import java.util.*;
import java.io.*;

public class MovieSentiments {

	int sentenceID;
	int totalScore;
	int numPhrases;
	
	//Constructor for ReviewEntry object
	public MovieSentiments(int sentID, String phrase) {
		sentenceID = sentID;
		String score = phrase.substring(phrase.length() - 1);
		totalScore = Integer.parseInt(score);
		numPhrases = 1;
	}
	
	//Checks if sentence ID is already in the array
	public static boolean IDIsInArray(int ID, Bullock_ReviewEntry[] arr, int numReviews) {
		boolean IDInArray = false;
		for (int i = 0; i < numReviews; ++i) {
			if (ID == arr[i].getSentenceID()) {
				IDInArray = true;
				break;
			}
		}
		return IDInArray;
	}
	
	//Retrieves the sentence ID of the phrase in question
	public static int retrieveIDFromData(String phrase) {
		Scanner scan = new Scanner(phrase);
		scan.nextInt();
		int ID = scan.nextInt();
		return ID;
	}
	
	//Accessor method for sentenceID
	public int getSentenceID() {
		return sentenceID;
	}
	
	//Retrieves ReviewEntry objects that are in array
	public static Bullock_ReviewEntry getObject(int ID, Bullock_ReviewEntry[] arr, 
												int numReviews) {
		Bullock_ReviewEntry obj = null;
		
		for (int i = 0; i < numReviews; ++i) {
			if (ID == arr[i].getSentenceID()) {
				obj = arr[i];
				break;
			}
		}
		
		return obj;
	}
	
	//Updates the total score and number of phrases of the sentenceID 
	public void updateTotalAndNumPhrases(String phrase) {
		String score = phrase.substring(phrase.length() - 1);
		totalScore += Integer.parseInt(score);
		numPhrases += 1;
	}
	
	//Prints out sentiment statistics
	public void printStatistics() {
		System.out.println("");
		System.out.print("Sentence ID " + sentenceID + " has " + numPhrases);
		System.out.print(" phrases with an average rating of ");
		System.out.printf("%.1f", ((double)totalScore / numPhrases));
		System.out.println(". The overall sentiment is " + getSentiment() + ".");
	}
	
	//Performs calculations to determine sentiment
	public String getSentiment() {
		String sentiment;
		
		if (((double)totalScore / numPhrases) < 2.0) {
			sentiment = "negative";
		}
		else if (((double)totalScore / numPhrases) < 3.0) {
			sentiment = "neutral";
		}
		else {
			sentiment = "positive";
		}
		
		return sentiment;
	}
	
	//Main method
	public static void main(String[] args) throws IOException {
		
		int sentID;
		String phraseInQuestion;
		
		File file = new File("movieReviews.tsv");
		Scanner scan = new Scanner(file);
		
		Bullock_ReviewEntry[] arr = new Bullock_ReviewEntry[8544];
		int numReviews = 0;
		
		scan.nextLine(); //To skip header line
		
		//Loop to put all of the ReviewEntry objects into the array 
		while (scan.hasNext()) {
			phraseInQuestion = scan.nextLine();
			sentID = retrieveIDFromData(phraseInQuestion);
			if (IDIsInArray(sentID, arr, numReviews)) {
				getObject(sentID, arr, numReviews).updateTotalAndNumPhrases(phraseInQuestion);
			}
			else {
				Bullock_ReviewEntry entry = new Bullock_ReviewEntry(sentID, phraseInQuestion);
				arr[numReviews] = entry;
				++numReviews;
			}
		}
		
		scan.close();
		
		//User interface block of code
		Scanner sc = new Scanner(System.in);
		System.out.print("What sentence ID would you like statistics from? ");
		int userID = sc.nextInt();
		
		try {
			getObject(userID, arr, numReviews).printStatistics();
		}
		catch (Exception e) {
			System.out.println("Invalid Sentence ID");
		}
	}
}
		
				
			
			
			
		
		
		
		
		
		
		
		