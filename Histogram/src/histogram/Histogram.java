// Reactivo concurso interno 2013
package histogram;

import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        StringBuilder result = new StringBuilder();
        int num;

        while ((num = sc.nextInt()) > 0) {
            list.add(num);
        }

        for (int val : list) {

            if (result.length() > 0 && val > 0) {
                result.append("\n");
            }

            for (int i = 0; i < val; i++) {
                result.append("*");
            }
        }

        System.out.println(result);
    }

}
