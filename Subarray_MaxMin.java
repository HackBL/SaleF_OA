import java.util.*;
/**
 *      最大滑动窗口
 *
 * */
public class Subarray_MaxMin {

    public int solution(int[] arr, int k) {
        if (arr.length < k) return -1;
        int[] buffer = new int[arr.length-k+1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if  (!deque.isEmpty() && deque.peekFirst() == i-k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[i] <= arr[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k-1)
                buffer[i-k+1] = arr[deque.peekFirst()];
        }

        int res = buffer[0];

        for (int i = 0; i < buffer.length; i++) {
            res = Math.max(res, arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        // -1, -3, -3, -3, 3, 3   return 3;
        Subarray_MaxMin s = new Subarray_MaxMin();
        System.out.println(s.solution(arr, k));
    }
}
