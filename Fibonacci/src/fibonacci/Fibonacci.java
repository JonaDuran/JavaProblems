// Reactivo A Vallarta 2014
// INCOMPLETO
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        long start, end;
        Scanner sc = new Scanner(System.in);
        int i, in = 30 /*sc.nextInt()*/;
        
        String x = "0";
        String y = "1";
        String z = "10";
        
        start = System.currentTimeMillis();
        
        for (i = 3; i <= in; i++) {
            switch (i % 3) {
                case 0:
                    x = z + y;
                    break;
                case 1:
                    y = x + z;
                    break;
                case 2:
                    z = y + x;
                    break;
            }
        }
        
        switch (i % 3) {
            case 0:
                System.out.println(x);
                break;
            case 1:
                System.out.println(y);
                break;
            case 2:
                System.out.println(z);
                break;
        }
        
        end = System.currentTimeMillis();
        System.err.println(end - start);
        
    }
    
}
