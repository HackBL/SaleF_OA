/**
 *          Input: releaseTimes = [12,23,36,46,62], keysPressed = "spuda"
 *          Output: "a"
 *          Explanation: The keypresses were as follows:
 *                      Keypress for 's' had a duration of 12.
 *                      Keypress for 'p' had a duration of 23 - 12 = 11.
 *                      Keypress for 'u' had a duration of 36 - 23 = 13.
 *                      Keypress for 'd' had a duration of 46 - 36 = 10.
 *                      Keypress for 'a' had a duration of 62 - 46 = 16.
 *                      The longest of these was the keypress for 'a' with duration 16.
 *
 * */

public class Slowest_Key {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int duration = releaseTimes[0];
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (releaseTimes[i] - releaseTimes[i-1] > duration) {
                duration = releaseTimes[i] - releaseTimes[i-1];
                index = i;
            } else if (releaseTimes[i] - releaseTimes[i-1] == duration) {
                if (keysPressed.charAt(i) > keysPressed.charAt(index)) {
                    index = i;
                }
            }
        }

        return keysPressed.charAt(index);
    }
}
