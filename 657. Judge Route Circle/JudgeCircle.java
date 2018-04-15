import java.util.HashMap;

/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

 Example 1:
 Input: "UD"
 Output: true
 *
 *
 * Created by ©Ameya on 4/15/2018 at 6:26 PM.
 */
public class JudgeCircle {

    public static void main(String[] args) {
        System.out.println(judgeCircle("UDL"));
    }

    private static boolean judgeCircle(String directions) {
       int count = 0;
        HashMap<Character,Integer> directionValues = new HashMap<>();
        directionValues.put('L',-1);
        directionValues.put('R',+1);
        directionValues.put('U',-2);
        directionValues.put('D',2);

        for (char c:directions.toCharArray()) {
            count += directionValues.get(c);
        }

        return count == 0;
    }
}
