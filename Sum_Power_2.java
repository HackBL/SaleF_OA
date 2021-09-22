/**
 *  就是给一个arr[n], 里面一堆数，从第一个开始往最后一个扫，减去比自己小的最大的power of 2, 剩下的值再去加下一个数继续减, 一直到末尾, 问减过的最大power2是多少
 *  比如
 *  [9 , 16, 20 ,21 ,2]
 *
 *  9-8=1, 1+16=17, 17-16=1, 1+20=21, 21-16=5, 5+21=26, 26-16=10, 10+2=12, 12 -8=4, 最大的减是16 于是return 16
 * */


public class Sum_Power_2 {
    public int solution(int[] arr) {
        int max = 0;
        int remain = 0;

        for (int n: arr) {
            remain = remain + n;
            int powNum = maxPower(remain);
            remain -= powNum;

            max = Math.max(max, powNum);
        }

        return max;
    }

    public int maxPower(int n) {
        int k = (int)(Math.log(n) / Math.log(2));
        int res = (int)Math.pow(2, k);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9, 16, 20 ,21 ,2};
        Sum_Power_2 s = new Sum_Power_2();
        System.out.println(s.solution(arr));
    }
}
