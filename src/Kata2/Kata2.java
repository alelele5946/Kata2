package Kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 4, 8, 9, 10, 3, 12, 5, 14, 4};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();

        /*for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);

            }

        }*/
        
        /*for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) +1 : 1);
            
        }*/
        for (Integer key : histogr.keySet()) {

                System.out.println(key + " ==> " + histogr.get(key));
            }
    }

}
