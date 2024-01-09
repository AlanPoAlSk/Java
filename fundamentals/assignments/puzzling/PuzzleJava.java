import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random random = new Random();
    public ArrayList<Integer> getTenRolls(int numOfRolls) {
        ArrayList<Integer> randomRolls = new ArrayList<>();
        for (int i = 0; i < numOfRolls; i++) {
            randomRolls.add(random.nextInt(20) + 1);
        }
        return randomRolls;
    }

    public ArrayList<String> getRandomLetter(int numOfLetters) {
        ArrayList<String> randomLetter = new ArrayList<>(26);
            while (randomLetter.size() < Math.min(numOfLetters, 26)){
                char randomChar = (char) (random.nextInt(26) + 'a');
                String charStr = String.valueOf(randomChar);
                if (!randomLetter.contains(charStr)) {
                    randomLetter.add(charStr);
                }
            }
        
        return randomLetter;
        
    }

    public ArrayList<String> generatePasswords(int numOfPasswords, int numOfLetters) {
        ArrayList<String> randomPasswords = new ArrayList<>();

        for (int i = 0; i < numOfPasswords; i++) {
            ArrayList<String> passwordChars = getRandomLetter(numOfLetters);
            String password = String.join("", passwordChars);
            randomPasswords.add(password);
        }

        return randomPasswords;
    }
}

