import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ©Ameya on 3/9/2018 at 1:31 AM.
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1,2};
        int nums2[] = {2, 2};
        intersect(nums1, nums2);
    }

    private static int[]  intersect(int[] nums1, int[] nums2) {
        //Using HashMap for nums1 array elements
        HashMap<Integer, Integer> hm = new HashMap<>();
        // Using ArrayList for the result as the size of the list not known Apriori
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int number : nums1) {
            if (hm.containsKey(number)) {
                int value = hm.get(number);
                hm.put(number, (value + 1));
            } else {
                hm.put(number, 1);
            }
        }
        for (int aNums2 : nums2) {

            if (hm.containsKey(aNums2)) {
                resultList.add(aNums2);
                int count = hm.get(aNums2);
                count--;
                if (count > 0) {
                    hm.put(aNums2, count);
                } else {
                    hm.remove(aNums2);
                }
            }
        }

        //Converting Arraylist into Array
        int[] intersectArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size() ; i++) {
            intersectArray[i] = resultList.get(i);
        }
        return intersectArray;
    }
}
