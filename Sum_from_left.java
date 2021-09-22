/**
 *      给一个array 每个element 看左边的所有element比他大还是小，如果大就用 0 - abs(x - x[i - k])， 如果小就是0 + abs(x - x[i - k])
 *      最后返回一个list
 *          example: [1,2,3,4,2]
 *          output : [0, 1, 3, 6, -2 ]
 *      最后一个是因为
 *      3,4 比2大就 0 - abs(4 - 2) - abs(3 - 2) + abs(2 - 1)
 * */

public class Sum_from_left {
    private int[] solution(int[] arr) {
        int[] res = new int[arr.length];

        res[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            res[i] = (arr[i] - arr[i-1]) * i + res[i-1];
        }

        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        Sum_from_left s = new Sum_from_left();
        int[] res = s.solution(arr);

        for (int n: res)
            System.out.print(n + " ");
    }
}
