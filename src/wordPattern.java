import java.util.Hashtable;

public class wordPattern {
    public boolean wordPatt(String pattern, String str) {
        Hashtable<Character, String> pat = new Hashtable<>();
        String[] words = str.split(" ");
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(pat.get(c) == null)
                pat.put(c, words[i]);
            else if(pat.get(c).equals(words[i]))
                return false;
        }
        return true;
    }
}
