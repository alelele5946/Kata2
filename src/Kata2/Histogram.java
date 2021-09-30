package Kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    protected int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public HashMap<Integer,Integer> getHistogram(){
        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : this.data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) +1 : 1);
            
        }
        return histogram;
    }
    
}
