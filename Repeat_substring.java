/**
 *      s是否有重复substring
 *
 * */

public class Repeat_substring {
    public boolean solution(String s) {
        if (s.length() == 0) return false;

        int len = s.length();

        for (int i = len/2; i >= 1; i--) {
            if (len % i == 0) {
                int m = len / i;

                String str = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(str);
                }

                if (sb.toString().equals(s)) return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String s = "abcabc";
        Repeat_substring r = new Repeat_substring();
        System.out.println(r.solution(s));
    }
}
