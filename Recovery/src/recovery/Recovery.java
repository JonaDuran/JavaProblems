// Reactivo E Vallarta 2014
package recovery;

import java.util.Scanner;

public class Recovery {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(" ");

        char[] ch = new Scanner(System.in).nextLine().toCharArray();

        for (int i = 1; i < ch.length; i++) {

            if (isNumber(ch[i]) || ch[i] == '.') {
                sb.append(ch[i]);

            } else if (sb.charAt(sb.length() - 1) != ' ') {
                sb.append(' ');
            }
        }

        String[] nums = sb.toString().trim().split(" ");
        sb.delete(0, sb.length());

        for (String num : nums) {
            if (isPrime(num.split("\\.")[1])) {
                sb.append(num).append(' ');
            }
        }

        System.out.println(sb);

    }

    static boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }

    static boolean isPrime(String num) {
        int n = Integer.parseInt(num.charAt(num.length() - 1) + "");

        if (n % 2 == 0 || n == 5) {
            return false;
        }

        n = Integer.parseInt(num);

        for (int i = 3; i < n / 2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
