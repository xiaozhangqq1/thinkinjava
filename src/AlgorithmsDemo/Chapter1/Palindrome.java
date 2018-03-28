package AlgorithmsDemo.Chapter1;

/**
 * Created by zhangxuelong on 2018/3/28
 */
public class Palindrome {
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N / 2; i++) {
            if (s.charAt(i) != s.charAt(N - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("helloolleh"));
    }
}
