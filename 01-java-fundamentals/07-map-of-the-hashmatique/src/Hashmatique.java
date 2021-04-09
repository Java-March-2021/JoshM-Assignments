import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> song = new HashMap<String, String>();
        song.put("One", "Will this really work?");
        song.put("Two", "This is actually working!");
        song.put("Three", "Don't break it.");
        song.put("Four", "MWHAHAHAHAHAHAAHHAHAHAHAAHAHA....");

        Set<String> keys = song.keySet();

        for (String key : keys) {
            System.out.println(key + ": " + song.get(key));
        }


    }
}