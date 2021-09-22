/**
 *      就是尽量把arr里面所有数字变小但是相对order不变
 *      比如arr = [1,4,8,4], 要求return [1,2,3,2]
 * */
import java.util.*;

public class Compliance_Priorities {
    public int[] solution(int[] arr) {
        if (arr.length == 0) return new int[0];

        Map<Integer, Integer> map = new HashMap<>();

        int k = 1;
        for (int n: arr) {
            if (!map.containsKey(n)) {
                map.put(n, k++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,8,4};
        Compliance_Priorities c = new Compliance_Priorities();
        int[] res = c.solution(arr);

        for (int n: res)
            System.out.print(n + " ");
    }
}
