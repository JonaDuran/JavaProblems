// Concurso interno 2013
package numbercount;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumberCount {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap();

        String line = new Scanner(System.in).nextLine();
        Scanner num = new Scanner(line);
        StringBuffer result = new StringBuffer();
        int next, count;

        while (num.hasNext()) {
            next = num.nextInt();
            count = (map.get(next) == null) ? 1 : map.get(next) + 1;
            map.put(next, count);
        }
        
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            Integer key = entrySet.getKey();
            Integer value = entrySet.getValue();
            
            if (value > 2) {
                result.append(key).append(" ");
            }
        }
        
        System.out.println(result.deleteCharAt(result.length() - 1));
    }
}
