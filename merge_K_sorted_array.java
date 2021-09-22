import java.util.*;
public class merge_K_sorted_array {
    public int[] solution(int[][] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);

        return res;
    }


    // [1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 7, 9, 9, 10, 10]
    public static void main(String[] args) {
        int[][] arr = {{1,5,6,9,10},
                        {2,3,5,7,9},
                        {1,4,5,7,10}};

        merge_K_sorted_array m = new merge_K_sorted_array();
        int[] res = m.solution(arr);
        for (int n:res)
            System.out.print(n + " ");
    }
}
