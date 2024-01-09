import java.util.HashMap;
import java.util.Set;
public class TestTrackList {
    public static void main(String[] args) {
        HashMap<String, String> songsMap = new HashMap<String, String>();
        songsMap.put("Radio gaga", "All we hear is ...");
        songsMap.put("We are the champions", "I thank you all...");
        songsMap.put("Bicycle", "I want to ride my...");
        songsMap.put("Mr bad guy", "I am everybody's...");
        songsMap.put("Play the game", "It's so easy...");
        songsMap.put("Bohemian rhapsody", "Mama...");
        // get the keys by using the keySet method
        Set<String> keys = songsMap.keySet();
        System.out.println("---- Pull out one song by its track title ----");
        System.out.println(songsMap.get("Mr bad guy"));
        System.out.println("---- Print out all the track names and lyrics ----");
        for(String key : keys) {
            System.out.println(String.format("Song: %s - lyrics: %s" ,key ,songsMap.get(key)));
            // System.out.println();    
        }
    }
}