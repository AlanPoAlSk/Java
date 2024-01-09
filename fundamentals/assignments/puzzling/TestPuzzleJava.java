import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
        Random random = new Random();
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls(10);
		System.out.println(randomRolls);
		
    	        //..
		// Write your other test cases here.
		//..

        ArrayList<String> randomLetter = generator.getRandomLetter(26);
        System.out.println("---- Array of all letters but inserted randomly ----"); 
        System.out.println(randomLetter); 
        System.out.println("---- Random letter from the previous Array ----"); 
        System.out.println(randomLetter.get(random.nextInt(randomLetter.size())));

        String randomPassword = "";
        for(int i = 0; i< 8; i++){
            randomPassword += randomLetter.get(random.nextInt(randomLetter.size()));
        }
        ArrayList<String> randomPasswords = generator.generatePasswords(6,8);

        
        System.out.println("---- Random Password ----");
        System.out.println(randomPassword);
        

        int numOfPasswords = 5;
        int numOfLetters = 8;
        
        
        System.out.println("---- Array of randomly generated passwords ----");
        System.out.println(randomPasswords);
	}
}
