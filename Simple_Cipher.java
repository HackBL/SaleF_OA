/**
 *      s = ABC, k = 2
 *      每个元素往前移2位
 *
 *      output:
 *          YZA
 *
 * */


public class Simple_Cipher {
    public String solution(String s, int k) {
        k %= 26;
        if (k == 0) return s;

        StringBuilder sb = new StringBuilder();

        for (char c: s.toCharArray()) {
            if (c - 'A' - k < 0) {
                c = (char) (c - 'A' - k + 26);
                sb.append((char)(c + 'A'));
            } else {
                c = (char) (c - k);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "AYZ";  //
        int k = 28; // 2

        Simple_Cipher sc = new Simple_Cipher();
        System.out.println(sc.solution(s, k));
    }
}
