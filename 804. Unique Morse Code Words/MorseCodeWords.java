import java.util.HashMap;
import java.util.HashSet;

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

 For convenience, the full table for the 26 letters of the English alphabet is given below:
 *[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *
 *
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

     Return the number of different transformations among all words we have.
 *
 * Created by ©Ameya on 4/15/2018 at 1:35 PM.
 */
public class MorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));

    }

    private static int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> morseCodes = new HashMap<>();
        HashSet<String> uniqueMorseCodes = new HashSet<>();
        // Putting appropriate values in HashMap
        morseCodes.put('a',".-");
        morseCodes.put('b',"-...");
        morseCodes.put('c',"-.-.");
        morseCodes.put('d',"-..");
        morseCodes.put('e',".");
        morseCodes.put('f',"..-.");
        morseCodes.put('g',"--.");
        morseCodes.put('h',"....");
        morseCodes.put('i',"..");
        morseCodes.put('j',".---");
        morseCodes.put('k',"-.-");
        morseCodes.put('l',".-..");
        morseCodes.put('m',"--");
        morseCodes.put('n',"-.");
        morseCodes.put('o',"---");
        morseCodes.put('p',".--.");
        morseCodes.put('q',"--.-");
        morseCodes.put('r',".-.");
        morseCodes.put('s',"...");
        morseCodes.put('t',"-");
        morseCodes.put('u',"..-");
        morseCodes.put('v',"...-");
        morseCodes.put('w',".--");
        morseCodes.put('x',"-..-");
        morseCodes.put('y',"-.--");
        morseCodes.put('z',"--..");

        for (String word: words) {
            StringBuilder encodededString = new StringBuilder();
            for (char c:word.toCharArray()) {
                encodededString.append(morseCodes.get(c));
            }
            //Add the word into hashSet as only unique words will be added here
            uniqueMorseCodes.add(encodededString.toString());
        }


        return uniqueMorseCodes.size();
    }
}
