import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ©Ameya on 3/9/2018 at 1:10 AM.
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println("Enter your J string = ");
        Scanner sc = new Scanner(System.in);
        String j = sc.nextLine();
        System.out.println("Enter your S string = ");
        String s =sc.nextLine();

        System.out.println(numJewelsInStones(j,s));

    }

    private static int numJewelsInStones(String J, String S) {
        int count = 0;
        HashSet<Character> jewellery = new HashSet<>();
        for (int i = 0; i < J.length() ; i++) {
            jewellery.add(J.charAt(i));
        }

        for (int j = 0; j < S.length(); j++){
            if (jewellery.contains(S.charAt(j))) {
                count++;
            }
        }

        return count;
    }
}

