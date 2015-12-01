// Reactivo K Vallarta 2014
package hotestmountain;

import java.util.Scanner;

public class HotestMountain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        int result = 0;
        double num;
        double hotest = 0;

        for (int i = 0; i < lim; i++) {
            num = sc.nextDouble();
            
            if (num >= hotest) {
                hotest = num;
                result = i;
            }
        }
        
        System.out.println(result + 1);
    }

}
