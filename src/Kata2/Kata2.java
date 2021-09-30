package Kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();

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
        for (String key : histogr.keySet()) {

                System.out.println(key + " ==> " + histogr.get(key));
            }
    }

}
